package com.yizhidou.paper.service.impl;

import com.yizhidou.paper.entity.*;
import com.yizhidou.paper.mapper.ChoiceMapper;
import com.yizhidou.paper.mapper.GapFillingMapper;
import com.yizhidou.paper.mapper.PaperQuestionMapper;
import com.yizhidou.paper.mapper.PapersMapper;
import com.yizhidou.paper.service.IPapersService;
import com.yizhidou.paper.service.ex.NotFoundQuestionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/**
 * 试卷业务层接口实现类
 */

@Service
public class PapersServiceImpl implements IPapersService {

    @Autowired
    PapersMapper Pamapper;

    @Autowired
    PaperQuestionMapper Pqmapper;

    @Autowired
    GapFillingMapper Gmapper;

    @Autowired
    ChoiceMapper Cmapper;

    /**
     * 随机组卷
     * @param paper
     * @param names
     * @param amount
     */
    @Override
    @Transactional
    public void insertPap(
            Papers paper, List<String> names, int amount) {

        List<Integer> gap = new ArrayList<>();
        List<GapFilling> gf = Gmapper.findByknows(names, amount);
        if(gf.size() == 0){
            throw new NotFoundQuestionException(
                    "没找到此类型题目");
        }
        for(GapFilling g : gf){
            gap.add(g.getGfTypeChoice());
        }

        List<Integer> choice = new ArrayList<>();
        List<Choice> ce = Cmapper.findByknows(names,amount);
        if(ce.size() == 0){
            throw new NotFoundQuestionException(
                    "没找到此类型题目");
        }
        for(Choice c : ce){
            choice.add(c.getQuestionTypeChoice());
        }

        int pid = insert(paper,gap);

        PaperQuestion pq = new PaperQuestion();
        for(Integer i : choice){
            pq.setQid(i);
            pq.setPid(pid);
            Pqmapper.insert(pq);
        }
    }

    /**
     * 固定组卷(手动组卷)
     * @param paper 基本试卷属性
     * @param questionId 手动选择出来的题目的id
     */
    @Override
    public void insertPaper(Papers paper, List<Integer> questionId) {
        insert(paper, questionId);
    }

    /**
     * 查找全部试卷
     * @return
     */
    @Override
    public List<Papers> findAllPapers() {
        PapersExample pe = new PapersExample();
        List<Papers> list = Pamapper.selectByExample(pe);
        return list;
    }

    /**
     * 根据试卷id查找全部题目
     * @param pid
     * @return 返回的是一个map,一个题型对应一个集合
     */
    @Override
    public HashMap<String, Object> findByPid(Integer pid) {
        List<Choice> choice = Pqmapper.findCByPid(pid);
        List<GapFilling> gaf = Pqmapper.findGByPid(pid);
        List<QuestionAnswer> qa = Pqmapper.findQAByPid(pid);
        HashMap<String,Object> map = new HashMap<>();
        map.put("选择题",choice);
        map.put("填空题",gaf);
        map.put("问答题",qa);
        return map;
    }

    public int insert(Papers paper, List<Integer> questionId){
        Pamapper.insertSelective(paper);
        int pid = paper.getPaperId();
        PaperQuestion pq = new PaperQuestion();
        for(Integer i : questionId){
            pq.setQid(i);
            pq.setPid(pid);
            Pqmapper.insert(pq);
        }
        return pid;
    }
}

