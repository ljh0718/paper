package com.yizhidou.paper.controller;

import com.yizhidou.paper.entity.PaperResult;
import com.yizhidou.paper.service.IPaperResultsService;
import com.yizhidou.paper.util.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 试卷答案控制器层
 */


@RestController
@RequestMapping(value = "/paper",method = RequestMethod.GET)
@Api(value="试卷问答题答案控制类",tags="试卷问答题答案")
public class PaperResultController extends BaseController{

    @Autowired
    private IPaperResultsService paperResultService;

    @RequestMapping(value = "/addPaRe",method = RequestMethod.GET)
    @ApiOperation(value="插入试卷问答题用户答案",notes = "插入每张试卷每个用户的每个问答题的用户答案")
    public ResponseResult<Void> addPaperResults(
            @RequestParam("results") List<String> results, HttpSession session){
       paperResultService.insertPaperResult(results, session);
        return new ResponseResult<>(SUCCESS);
    }
}

