package com.yizhidou.paper.controller;

import com.yizhidou.paper.service.ex.*;
import com.yizhidou.paper.util.ResponseResult;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpSession;

/**
 * 控制器的基类
 */

public abstract class BaseController {

    /**
     * 响应结果的状态:成功
     */
    public static final Integer SUCCESS = 200;

    /**
     * 获取封装在Session中的用户pid
     * @param session
     * @return
     */
    public final Integer getPersonIdFromSession(HttpSession session){
        return Integer.valueOf(session.getAttribute("personId").toString());
    }

    /**
     * 获取封装在Session中的试卷ID
     * @param session
     * @return
     */
    public final Integer getPaperIdFromSession(HttpSession session){
        return Integer.valueOf(session.getAttribute("paperId").toString());
    }

    /**
     * 统一处理异常
     * @param e
     * @return
     */
    @ExceptionHandler
    public ResponseResult<Void> handleException(Throwable e){
        ResponseResult<Void> rr
                = new ResponseResult<>();
        rr.setMessage(e.getMessage());

        if(e instanceof UserNotFoundException){
                //用户数据不存在
                rr.setStatus(400);
        }else if(e instanceof UserAlreadyExistsException){
                //用户名已存在
                rr.setStatus(401);
        }else if(e instanceof PasswordNotMatchException){
                //密码匹配错误
                rr.setStatus(403);
        }else if(e instanceof NotFoundQuestionException){
                //找不到题目
                rr.setStatus(600);
        }
        return rr;
    }
}
