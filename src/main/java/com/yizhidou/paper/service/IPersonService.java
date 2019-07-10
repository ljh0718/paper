package com.yizhidou.paper.service;

import com.yizhidou.paper.entity.Person;
import com.yizhidou.paper.service.ex.PasswordNotMatchException;
import com.yizhidou.paper.service.ex.UserAlreadyExistsException;
import com.yizhidou.paper.service.ex.UserNotFoundException;

/**
 * 用户业务层接口
 */

public interface IPersonService {

    /**
     * 添加用户
     * @param person
     * @return
     */

    void addPerson(Person person) throws UserAlreadyExistsException;


    /**
     * 登录
     * @param username
     * @param password
     * @return
     */

    Person login(String username,String password)
            throws UserNotFoundException,PasswordNotMatchException;


    /**
     * 删除
     * @param pid
     * @return
     */

    void deletePerson(Integer pid)throws UserNotFoundException;


    /**
     * 修改密码
     * @param pid
     * @param password
     * @return
     */

    void updatePassword(Integer pid,String oldPassword,String newPassword)
           throws PasswordNotMatchException,
                UserNotFoundException;


    /**
     * 修改个人资料
     * @param person
     * @throws UserNotFoundException
     */

    void updateInfo(Person person)
            throws UserNotFoundException;


    /**
     * 查询
     * @param Username
     * @return
     */

    Person findByPid(Integer Pid) throws UserNotFoundException;
}

