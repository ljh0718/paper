package com.yizhidou.paper.mapper;

import com.yizhidou.paper.entity.PaperGrade;
import com.yizhidou.paper.entity.PaperGradeExample;
import java.util.List;

import io.swagger.models.auth.In;
import org.apache.ibatis.annotations.Param;

public interface PaperGradeMapper {
    int countByExample(PaperGradeExample example);

    int deleteByExample(PaperGradeExample example);

    int deleteByPrimaryKey(Integer paperGradeId);

    int insert(PaperGrade record);

    int insertSelective(PaperGrade record);

    List<PaperGrade> selectByExample(PaperGradeExample example);

    PaperGrade selectByPrimaryKey(Integer paperGradeId);

    int updateByExampleSelective(@Param("record") PaperGrade record, @Param("example") PaperGradeExample example);

    int updateByExample(@Param("record") PaperGrade record, @Param("example") PaperGradeExample example);

    int updateByPrimaryKeySelective(PaperGrade record);

    int updateByPrimaryKey(PaperGrade record);

    int updateGradeWd(PaperGrade grade);
}