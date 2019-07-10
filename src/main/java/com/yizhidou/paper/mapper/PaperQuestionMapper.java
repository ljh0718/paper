package com.yizhidou.paper.mapper;

import com.yizhidou.paper.entity.*;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaperQuestionMapper {
    int countByExample(PaperQuestionExample example);

    int deleteByExample(PaperQuestionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PaperQuestion record);

    int insertSelective(PaperQuestion record);

    List<PaperQuestion> selectByExample(PaperQuestionExample example);

    PaperQuestion selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PaperQuestion record, @Param("example") PaperQuestionExample example);

    int updateByExample(@Param("record") PaperQuestion record, @Param("example") PaperQuestionExample example);

    int updateByPrimaryKeySelective(PaperQuestion record);

    int updateByPrimaryKey(PaperQuestion record);

    /**
     *根据试卷id查找全部选择题
     * @param pid
     * @return
     */
    List<Choice> findCByPid(Integer pid);


    /**
     * 根据试卷id查找全部填空题
     * @param pid
     * @return
     */
    List<GapFilling> findGByPid(Integer pid);

    List<QuestionAnswer> findQAByPid(Integer pid);

    List<Integer> findQidByPid(Integer pid);
}