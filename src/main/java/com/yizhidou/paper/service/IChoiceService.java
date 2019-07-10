package com.yizhidou.paper.service;

import com.yizhidou.paper.entity.Choice;
import com.yizhidou.paper.entity.Question;
import com.yizhidou.paper.service.ex.NotFoundQuestionException;
import com.yizhidou.paper.vo.PaperChoiceVO;

import java.util.List;

/**
 * 填空题业务层接口
 */
public interface IChoiceService {


    /**
     * 插入选择题
     * @param gf
     * @return
     */

    void insertCh(PaperChoiceVO vo);

    /**
     * 根据gfid删除题目
     * @param id
     */

    void deleteByChid(List<Integer> ids) throws NotFoundQuestionException;

    /**
     * 根据id查找题目
     * @param id
     * @return
     * @throws NotFoundQuestionException
     */

    List<Choice> findById(List<Integer> ids)
            throws NotFoundQuestionException;

    List<Choice> selectAll()
            throws NotFoundQuestionException;

    /**
     * 通过知识点名称和难度选填空题目
     * @param name
     * @param level
     * @return
     */

    List<Choice> findContentByNameAndLevel(
            List<String> name, String level)
            throws NotFoundQuestionException;

    /**
     * 根据知识点范围查找题目
     * @param knowNames
     * @param amount
     * @return
     * @throws NotFoundQuestionException
     */
    List<Choice> selectByKnowNames(
            List<String> knowNames, Integer amount)
            throws NotFoundQuestionException;
}

