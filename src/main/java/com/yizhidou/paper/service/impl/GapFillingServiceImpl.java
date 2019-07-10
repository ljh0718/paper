package com.yizhidou.paper.service.impl;

import com.yizhidou.paper.entity.GapFilling;
import com.yizhidou.paper.entity.Question;
import com.yizhidou.paper.mapper.GapFillingMapper;
import com.yizhidou.paper.mapper.QuestionMapper;
import com.yizhidou.paper.service.IGapFillingService;
import com.yizhidou.paper.service.ex.DeleteQuestionException;
import com.yizhidou.paper.service.ex.InsertQuestionException;
import com.yizhidou.paper.service.ex.NotFoundQuestionException;
import com.yizhidou.paper.vo.PaperQuestionVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;


/**
 * 填空题业务层接口实现类
 */

@Service
public class GapFillingServiceImpl implements IGapFillingService {

    @Autowired
    GapFillingMapper Gmapper;

    @Autowired
    QuestionMapper Qmapper;

    @Override
    @Transactional
    public void insertGf(PaperQuestionVO vo) {
        Question qt = new Question();
        qt.setQuestionType("单选");
        qt.setQuestionKnows(vo.getQuestionKnows());
        qt.setQuestionLevel(vo.getQuestionLevel());
        Integer row = Qmapper.insertQuestion(qt);

        GapFilling gf = new GapFilling();
        gf.setGfTypeChoice(qt.getQuestionTypeId());
        gf.setGfContent(vo.getQuestionInfo());
        gf.setGfKey(vo.getQuestionKey());
        gf.setGfValue(vo.getQuestionValue());
        Integer rows = Gmapper.insertGf(gf);
        if(row !=1 && rows !=1){
            throw new InsertQuestionException(
                    "插入题目时异常!");
        }
    }

    @Override
    @Transactional
    public void deleteByGfid(List<Integer> ids)
            throws NotFoundQuestionException {
        Integer row = Gmapper.deleteByGfid(ids);
        Integer rows = Qmapper.deleteByQid(ids);
        if(row != ids.size() && rows != ids.size()){
            throw new DeleteQuestionException(
                    "删除数据时出现异常!");
        }
    }

    @Override
    public List<GapFilling> selectAll() throws NotFoundQuestionException {
        List<GapFilling> gp = Gmapper.findAll();
        if(gp.size() == 0){
            throw new NotFoundQuestionException(
                    "找不到此题目");
        }
        return gp;
    }

    /**
     * 根据题目id查找题目相关信息
     * @param id
     * @return
     */
    @Override
    public List<GapFilling> findById(List<Integer> gfIds) throws NotFoundQuestionException {
        List<GapFilling> gp = Gmapper.findByQTid(gfIds);
        if(gp.size() == 0){
            throw new NotFoundQuestionException(
                    "找不到此题目");
        }
        return gp;
    }


/**
     * 根据题目的知识点范围或者题目难度筛选试题
     * @param name
     * @param level
     * @return
     */
    @Override
    public List<GapFilling> findContentByNameAndLevel(
            List<String> name, String level)
                throws NotFoundQuestionException {
        List<GapFilling> gf = Gmapper.findByknowsAndLevel(name,level);
        if(gf.size() == 0){
            throw new NotFoundQuestionException(
                    "没找到题目");
        }
        return gf;
    }

/**
     * 随机出题①
     * @param knows
     * @param amount 题目数量
     * @return
     * @throws NotFoundQuestionException
     */
    @Override
    public List<GapFilling> selectByKnowNames(
            List<String> knowNames, Integer amount)
            throws NotFoundQuestionException {
        List<GapFilling> gf = Gmapper.findByknows(knowNames, amount);
        if(gf.size() == 0){
            throw new NotFoundQuestionException(
                    "没找到此类型题目");
        }
        return gf;
    }

    /*@Override
    public List<String> selectByKnowledgeName(
            List<String> knows)
            throws NotFoundQuestionException {
        List<GapFilling> gf = Gmapper.selectByKnowledgeName(knows);
        if(gf.size() == 0){
            throw new NotFoundQuestionException(
                    "没找到此类型题目");
        }

        //把所有符合条件的问题id取出存入准备好的集合中
        List<Integer> ids = new ArrayList<>();
        for(GapFilling g : gf){
            ids.add(g.getGfId());
        }

        //随机取出集合中的id,加入新的集合中
        Random rand = new Random();
        Set<Integer> idss = new HashSet<>();
        List<Integer> lis = new ArrayList<>();
        while(idss.size()!=amount){
            idss.add(
                    ids.get(
                            rand.nextInt(ids.size())
                            )
                    );
        }

        //把循环之后的数加入到list集合中
        for(Integer id : idss){
            lis.add(id);
        }

        //通过集合查找随机抽取出来题目内容
        List<GapFilling> gapf = Gmapper.findByGfid(lis);
        List<String> result = new ArrayList<>();
        for(GapFilling gfg : gapf){
            result.add(gfg.getGfContent());
        }
        return result;
    }

    */
}

