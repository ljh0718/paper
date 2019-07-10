package com.yizhidou.paper.mapper;

import com.yizhidou.paper.entity.Person;
import org.apache.ibatis.annotations.Param;

public interface PersonMapper {

    Integer insertPerson(Person person);


    /**
     * 根据pid删除用户
     * @param pid
     * @return
     */
    Integer deleteByPid(Integer pid);

    /**
     * 修改密码
     * @param pid
     * @param password
     * @return
     */
    Integer updatePassword(
            @Param("pid") Integer pid,
            @Param("password") String password);


    /**
     * 修改用户资料
     * @param person
     * @return
     */
    Integer updateInfo(Person person);

    Person fingByPid(Integer pid);

    /**
     * 根据用户名查询用户数据
     */
    Person findByUsername(String username);


}
