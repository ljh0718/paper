package com.yizhidou.paper.service.impl;

import com.yizhidou.paper.entity.Choice;
import com.yizhidou.paper.entity.Question;
import com.yizhidou.paper.mapper.ChoiceMapper;
import com.yizhidou.paper.mapper.QuestionMapper;
import com.yizhidou.paper.service.IChoiceService;
import com.yizhidou.paper.service.ex.DeleteQuestionException;
import com.yizhidou.paper.service.ex.InsertQuestionException;
import com.yizhidou.paper.service.ex.NotFoundQuestionException;
import com.yizhidou.paper.vo.PaperChoiceVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


/**
 * 填空题业务层接口实现类
 */

@Service
public class ChoiceServiceImpl implements IChoiceService {

    @Autowired
    ChoiceMapper Cmapper;

    @Autowired
    QuestionMapper Qmapper;

    @Override
    @Transactional
    public void insertCh(PaperChoiceVO vo) {
        Question qt = new Question();
        qt.setQuestionLevel(vo.getQuestionLevel());
        qt.setQuestionKnows(vo.getQuestionKnows());
        qt.setQuestionType("选择题");
        Integer row = Qmapper.insertQuestion(qt);

        Choice ch = new Choice();
        ch.setQuestionTypeChoice(qt.getQuestionTypeId());
        ch.setQuestionContent(vo.getQuestionInfo());
        ch.setChoice1(vo.getChoice1());
        ch.setChoice2(vo.getChoice2());
        ch.setChoice3(vo.getChoice3());
        ch.setChoice4(vo.getChoice4());
        ch.setQuestionKey(vo.getQuestionKey());
        ch.setQuestionValue(vo.getQuestionValue());

        Integer rows = Cmapper.insertCh(ch);
        if(row !=1 && rows !=1){
            throw new InsertQuestionException(
                    "插入题目时异常!");
        }
    }

    @Override
    @Transactional
    public void deleteByChid(List<Integer> ids)
            throws NotFoundQuestionException {
        Integer row = Cmapper.deleteByChid(ids);
        Integer rows = Qmapper.deleteByQid(ids);
        if(row != ids.size() && rows != ids.size()){
            throw new DeleteQuestionException(
                    "删除数据时出现异常!");
        }
    }

    @Override
    public List<Choice> selectAll()
            throws NotFoundQuestionException {
        List<Choice> ch = Cmapper.findAll();
        if(ch.size() == 0){
            throw new NotFoundQuestionException(
                    "找不到此题目");
        }
        return ch;
    }

    /**
     * 根据题目id查找题目相关信息
     * @param id
     * @return
     */
    @Override
    public List<Choice> findById(List<Integer> ChIds) throws NotFoundQuestionException {
        List<Choice> ch = Cmapper.findByQTid(ChIds);
        if(ch.size() == 0){
            throw new NotFoundQuestionException(
                    "找不到此题目");
        }
        return ch;
    }


/**
     * 根据题目的知识点范围或者题目难度筛选试题
     * @param name
     * @param level
     * @return
     */
    @Override
    public List<Choice> findContentByNameAndLevel(
            List<String> name, String level)
                throws NotFoundQuestionException {
        List<Choice> ch = Cmapper.findByknowsAndLevel(name, level);
        if(ch.size() == 0){
            throw new NotFoundQuestionException(
                    "没找到题目");
        }
        return ch;
    }

/**
     * 随机出选择题①
     * @param knows
     * @param amount 题目数量
     * @return
     * @throws NotFoundQuestionException
     */
    @Override
    public List<Choice> selectByKnowNames(
            List<String> knowNames, Integer amount)
            throws NotFoundQuestionException {
        List<Choice> ch = Cmapper.findByknows(knowNames, amount);
        if(ch.size() == 0){
            throw new NotFoundQuestionException(
                    "没找到此类型题目");
        }
        return ch;
    }
}

