package com.yizhidou.paper.controller;

import com.yizhidou.paper.entity.Choice;
import com.yizhidou.paper.entity.GapFilling;
import com.yizhidou.paper.entity.Papers;
import com.yizhidou.paper.service.IChoiceService;
import com.yizhidou.paper.service.IGapFillingService;
import com.yizhidou.paper.service.IPapersService;
import com.yizhidou.paper.util.ResponseResult;
import com.yizhidou.paper.vo.PaperChoiceVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 试卷控制器层
 */


@RestController
@RequestMapping(value = "/paper",method = RequestMethod.GET)
@Api(value="试卷控制类",tags="试卷")
public class PaperController extends BaseController{

    @Autowired
    private IPapersService paperService;

    @RequestMapping(value = "/rand1",method = RequestMethod.GET)
    @ApiOperation(value="随机出卷①",notes = "随机出填空题选择题进行出卷")
    public ResponseResult<Void> findByNameAndLevelId(Papers paper,
            @RequestParam("name") List<String> name,Integer amount,HttpSession session){
        paper.setPapername(getPersonIdFromSession(session).toString());
        paperService.insertPap(paper,name,amount);
        session.setAttribute("paperId",paper.getPaperId());
        return new ResponseResult<>(SUCCESS);
    }

    @RequestMapping(value = "/fixed",method = RequestMethod.GET)
    @ApiOperation(value="固定组卷",notes = "从题库中选取题目组成试卷")
    public ResponseResult<Void> fixedPaper(Papers paper,
            @RequestParam("questionId") List<Integer> questionId){
        paperService.insertPaper(paper,questionId);
        return new ResponseResult<>(SUCCESS);
    }

    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    @ApiOperation(value="查找全部试卷",notes = "查找全部试卷")
    public ResponseResult<List<Papers>> findAll(){
        List<Papers> data = paperService.findAllPapers();
        return new ResponseResult<>(SUCCESS,data);
    }

    @RequestMapping(value = "/findInfo",method = RequestMethod.GET)
    @ApiOperation(value="查找试卷内容",notes = "查找指定试卷id的内容")
    public ResponseResult<HashMap<String,Object>>
            findInfoByPid(Integer pid, HttpSession session){
        session.setAttribute("paperId",pid);
        HashMap<String,Object> data = paperService.findByPid(pid);
        return new ResponseResult<>(SUCCESS,data);
    }
}

