package com.yizhidou.paper.controller;

import com.yizhidou.paper.entity.PaperGrade;
import com.yizhidou.paper.service.IPaperGradeService;
import com.yizhidou.paper.util.ResponseResult;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 试卷分数控制器层
 */


@RestController
@RequestMapping(value = "/paperGrade",method = RequestMethod.GET)
@Api(value="试卷分数控制类",tags="试卷分数")
public class PaperGradeController extends BaseController{

    @Autowired
    private IPaperGradeService paperGradeService;

    @RequestMapping(value = "/addPaRe",method = RequestMethod.GET)
    @ApiOperation(value="插入试卷填选分数",notes = "插入每张试卷每个用户的每个填选分数")
    public ResponseResult<Void> addPaperTXGrade(
            @RequestParam("results") List<String> results, HttpSession session){
        PaperGrade grade = new PaperGrade();
        grade.setPersonId(getPersonIdFromSession(session));
        grade.setPaperId(getPaperIdFromSession(session));
        paperGradeService.insertPaperTXGrade(results, grade);
        return new ResponseResult<>(SUCCESS);
    }

    @RequestMapping(value = "/addPaWd",method = RequestMethod.GET)
    @ApiOperation(value="插入试卷问答题分数",notes = "插入每张试卷每个用户的每个问答题分数")
    @ApiImplicitParam(name = "personId",value = "当前被老师修改的试卷的用户ID",dataType = "Integer")
    public ResponseResult<Void> changePaperWDGrade(
            @RequestParam("grades") List<Integer> grades,Integer personId, HttpSession session){
        PaperGrade grade = new PaperGrade();
        grade.setPaperId(getPaperIdFromSession(session));
        paperGradeService.updatePaperWDGrade(grades,personId,grade);
        return new ResponseResult<>(SUCCESS);
    }

}

