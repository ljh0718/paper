package com.yizhidou.paper.service;

import com.yizhidou.paper.entity.GapFilling;
import com.yizhidou.paper.entity.Question;
import com.yizhidou.paper.mapper.GapFillingMapper;
import com.yizhidou.paper.service.ex.NotFoundQuestionException;
import com.yizhidou.paper.vo.PaperQuestionVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Set;

/**
 * 填空题业务层接口
 */
public interface IGapFillingService {


    /**
     * 插入填空题
     * @param gf
     * @return
     */

    void insertGf(PaperQuestionVO vo);

    /**
     * 根据gfid删除题目
     * @param id
     */

    void deleteByGfid(List<Integer> ids) throws NotFoundQuestionException;

    /**
     * 根据id查找题目
     * @param id
     * @return
     * @throws NotFoundQuestionException
     */

    List<GapFilling> findById(List<Integer> ids)
            throws NotFoundQuestionException;

    /**
     * 查找全部题目
     * @return
     * @throws NotFoundQuestionException
     */
    List<GapFilling> selectAll()
            throws NotFoundQuestionException;

    /**
     * 通过知识点名称和难度选填空题目
     * @param name
     * @param level
     * @return
     */

    List<GapFilling> findContentByNameAndLevel(
            List<String> name,String level )
            throws NotFoundQuestionException;

    /**
     * 根据知识点范围查找题目
     * @param knowNames
     * @param amount
     * @return
     * @throws NotFoundQuestionException
     */
    List<GapFilling> selectByKnowNames(
            List<String> knowNames,Integer amount)
            throws NotFoundQuestionException;
}

