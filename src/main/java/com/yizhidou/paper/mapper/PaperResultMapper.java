package com.yizhidou.paper.mapper;

import com.yizhidou.paper.entity.PaperResult;
import com.yizhidou.paper.entity.PaperResultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaperResultMapper {
    int countByExample(PaperResultExample example);

    int deleteByExample(PaperResultExample example);

    int deleteByPrimaryKey(Integer resId);

    int insert(PaperResult record);

    int insertSelective(PaperResult record);

    List<PaperResult> selectByExample(PaperResultExample example);

    PaperResult selectByPrimaryKey(Integer resId);

    int updateByExampleSelective(@Param("record") PaperResult record, @Param("example") PaperResultExample example);

    int updateByExample(@Param("record") PaperResult record, @Param("example") PaperResultExample example);

    int updateByPrimaryKeySelective(PaperResult record);

    int updateByPrimaryKey(PaperResult record);
}