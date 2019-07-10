package com.yizhidou.paper.mapper;

import com.yizhidou.paper.entity.QuestionAnswer;
import com.yizhidou.paper.entity.QuestionAnswerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionAnswerMapper {
    int countByExample(QuestionAnswerExample example);

    int deleteByExample(QuestionAnswerExample example);

    int deleteByPrimaryKey(Integer qaid);

    int insert(QuestionAnswer record);

    int insertSelective(QuestionAnswer record);

    List<QuestionAnswer> selectByExample(QuestionAnswerExample example);

    QuestionAnswer selectByPrimaryKey(Integer qaid);

    int updateByExampleSelective(@Param("record") QuestionAnswer record, @Param("example") QuestionAnswerExample example);

    int updateByExample(@Param("record") QuestionAnswer record, @Param("example") QuestionAnswerExample example);

    int updateByPrimaryKeySelective(QuestionAnswer record);

    int updateByPrimaryKey(QuestionAnswer record);
}