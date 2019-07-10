package com.yizhidou.paper.controller;

import com.sun.deploy.net.HttpResponse;
import com.yizhidou.paper.entity.Person;
import com.yizhidou.paper.service.IPersonService;
import com.yizhidou.paper.util.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;



/**
 * 用户控制器层
 */
@RestController
@RequestMapping(value = "/person",method = RequestMethod.GET)
@Api(value="用户的控制器层",tags="用户")
public class PersonController extends BaseController{

    @Autowired
    private IPersonService personService;

    @RequestMapping(value = "/reg",method = RequestMethod.GET)
    @ApiOperation(value="注册",notes = "用户注册")
    public ResponseResult<Void> reg(Person person){
        personService.addPerson(person);
        return new ResponseResult<>(SUCCESS);
    }

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    @ApiOperation(value="登录",notes = "用户登录")
    public ResponseResult<Person> login(
            @RequestParam("username") String username,
            @RequestParam("password")String password,
            HttpSession session, HttpServletResponse response){
        Person data = personService.login(username,password);
        //向Session中封装用户数据
        session.setAttribute("personId",data.getPid());
        session.setAttribute("username",data.getUsername());
        return new ResponseResult<>(SUCCESS,data);
    }

    @RequestMapping(value = "/deletePerson",method = RequestMethod.GET)
    @ApiOperation(value="删除",notes = "删除指定id的用户")
    public ResponseResult<Void> deleteP(Integer pid){
        personService.deletePerson(pid);
        return new ResponseResult<Void>(SUCCESS);
    }

    @RequestMapping(value = "/updatePwd",method = RequestMethod.GET)
    @ApiOperation(value="修改密码",notes = "修改用户密码")
    public ResponseResult<Void> updatePassword(
            HttpSession session,String oldPassword,
                String newPassword){
        Integer pid = getPersonIdFromSession(session);
        System.out.println(pid);
        personService.updatePassword(pid,oldPassword,newPassword);
        return new ResponseResult<Void>(SUCCESS);
    }

    @RequestMapping(value = "/updateInfo",method = RequestMethod.GET)
    @ApiOperation(value="修改资料",notes = "修改个人资料")
    public ResponseResult<Void> updatePassword(
            HttpSession session,Person person){
        Integer pid = getPersonIdFromSession(session);
        person.setPid(pid);
        personService.updateInfo(person);
        return new ResponseResult<Void>(SUCCESS);
    }
}
