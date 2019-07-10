package com.yizhidou.paper.mapper;

import com.yizhidou.paper.entity.TestSchedule;
import com.yizhidou.paper.entity.TestScheduleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestScheduleMapper {
    int countByExample(TestScheduleExample example);

    int deleteByExample(TestScheduleExample example);

    int deleteByPrimaryKey(Integer tsid);

    int insert(TestSchedule record);

    int insertSelective(TestSchedule record);

    List<TestSchedule> selectByExample(TestScheduleExample example);

    TestSchedule selectByPrimaryKey(Integer tsid);

    int updateByExampleSelective(@Param("record") TestSchedule record, @Param("example") TestScheduleExample example);

    int updateByExample(@Param("record") TestSchedule record, @Param("example") TestScheduleExample example);

    int updateByPrimaryKeySelective(TestSchedule record);

    int updateByPrimaryKey(TestSchedule record);
}