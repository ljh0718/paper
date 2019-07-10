package com.yizhidou.paper.mapper;

import com.yizhidou.paper.entity.Papers;
import com.yizhidou.paper.entity.PapersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PapersMapper {
    int countByExample(PapersExample example);

    int deleteByExample(PapersExample example);

    int deleteByPrimaryKey(Integer paperId);

    int insert(Papers record);

    int insertSelective(Papers record);

    List<Papers> selectByExample(PapersExample example);

    Papers selectByPrimaryKey(Integer paperId);

    int updateByExampleSelective(@Param("record") Papers record, @Param("example") PapersExample example);

    int updateByExample(@Param("record") Papers record, @Param("example") PapersExample example);

    int updateByPrimaryKeySelective(Papers record);

    int updateByPrimaryKey(Papers record);
}