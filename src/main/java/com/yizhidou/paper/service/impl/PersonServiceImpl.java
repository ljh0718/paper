package com.yizhidou.paper.service.impl;

import com.yizhidou.paper.entity.Person;
import com.yizhidou.paper.mapper.PersonMapper;
import com.yizhidou.paper.service.IPersonService;
import com.yizhidou.paper.service.ex.PasswordNotMatchException;
import com.yizhidou.paper.service.ex.UserAlreadyExistsException;
import com.yizhidou.paper.service.ex.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户业务层接口实现类
 */


@Service
public class PersonServiceImpl implements IPersonService {

    @Autowired
    private PersonMapper Pmapper;

    @Override
    public void addPerson(Person person) throws UserAlreadyExistsException{
        String username = person.getUsername();
        Person person1 = Pmapper.findByUsername(username);
        if(person1 == null){
            Pmapper.insertPerson(person);
        }else {
            throw new UserAlreadyExistsException(
                    "注册失败!您尝试注册的用户名("+username+")已存在!"
            );
        }
    }

    @Override
    public Person login(String username, String password)
            throws UserNotFoundException, PasswordNotMatchException {
        String pwd = null;
        Person p =
                Pmapper.findByUsername(username);
        if(p == null){
            throw new UserNotFoundException(
                    "不存在此用户!!!");
        }
        pwd = p.getPassword();
        if(pwd.equals(password)){
            Person person = Pmapper.findByUsername(username);
            person.setPassword(null);
            return person;
        }else{
            throw new PasswordNotMatchException(
                    "密码错误!!!");
        }
    }

    @Override
    public void deletePerson(Integer pid)
            throws UserNotFoundException {
        Integer rows = Pmapper.deleteByPid(pid);
        if(rows == 0){
            throw new UserNotFoundException(
                    "不存在此用户!!!");
        }
    }

    @Override
    public void updatePassword(
            Integer pid, String oldpassword,String newPassword)
                throws PasswordNotMatchException,
                    UserNotFoundException {
        String oPassword = Pmapper.fingByPid(pid).getPassword();

        if(oPassword == null){
            throw new UserNotFoundException(
                    "此用户不存在");
        }

        if(oldpassword.equals(oPassword)){
            Pmapper.updatePassword(pid,newPassword);
        }else {
            throw new PasswordNotMatchException(
                    "密码错误!!!");
        }
    }

    @Override
    public void updateInfo(Person person)
            throws UserNotFoundException {
        Integer rows = Pmapper.updateInfo(person);
        if(rows == 0){
            throw new UserNotFoundException(
                    "用户不存在");
        }
    }

    @Override
    public Person findByPid(Integer Pid)
            throws UserNotFoundException {
        Person person = Pmapper.fingByPid(Pid);
        if(person == null){
            throw new UserNotFoundException(
                    "此用户不存在");
        }
        return person;
    }
}
