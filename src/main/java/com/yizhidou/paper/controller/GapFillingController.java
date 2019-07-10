package com.yizhidou.paper.controller;

import com.yizhidou.paper.entity.GapFilling;
import com.yizhidou.paper.entity.Question;
import com.yizhidou.paper.service.IGapFillingService;
import com.yizhidou.paper.service.impl.GapFillingServiceImpl;
import com.yizhidou.paper.util.ResponseResult;
import com.yizhidou.paper.vo.PaperQuestionVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;


/**
 * 填空题控制器层
 */


@RestController
@RequestMapping(value = "/gapfilling",method = RequestMethod.GET)
@Api(value="填空题控制类",tags="填空题")
public class GapFillingController extends BaseController{

    @Autowired
    private IGapFillingService gapFillingService;

    @RequestMapping(value = "/addGf",method = RequestMethod.GET)
    @ApiOperation(value="添加",notes = "添加填空题试题")
    public ResponseResult<Void> addGf(PaperQuestionVO vo){
        gapFillingService.insertGf(vo);
        return new ResponseResult<>(SUCCESS);
    }

    @RequestMapping(value = "/dbi",method = RequestMethod.GET)
    @ApiOperation(value="删除",notes = "删除指定id的填空题题目")
    public ResponseResult<Void> deleteByGfid(
            @RequestParam(value ="questionTypeChoice") List<Integer> questionTypeChoice){
        gapFillingService.deleteByGfid(questionTypeChoice);
        return new ResponseResult<>(SUCCESS);
    }

    @RequestMapping(value = "/fbi",method = RequestMethod.GET)
    @ApiOperation(value="查找填空题题目",notes = "通过填空题id查找填空题题目")
    public ResponseResult<List<GapFilling>> findByGfid(
            @RequestParam("gfIds") List<Integer> gfIds){
        List<GapFilling> data = gapFillingService.findById(gfIds);
        return new ResponseResult<>(SUCCESS,data);
    }

    @RequestMapping(value = "/fa",method = RequestMethod.GET)
    @ApiOperation(value="查找填空题题目",notes = "查找全部题目")
    public ResponseResult<List<GapFilling>> findAll(){
        List<GapFilling> data = gapFillingService.selectAll();
        return new ResponseResult<>(SUCCESS,data);
    }


    @RequestMapping(value = "/fbn",method = RequestMethod.GET)
    @ApiOperation(value="查找填空题试题",notes = "通过知识点或难度查找填空题试题")
    public ResponseResult<List<GapFilling>> findByNameAndLevelId(
            @RequestParam("name") List<String> name,String level){
        List<GapFilling> data =
                gapFillingService
                        .findContentByNameAndLevel(name,level);
        return new ResponseResult<List<GapFilling>>(SUCCESS,data);
    }

    @RequestMapping(value = "/rand1",method = RequestMethod.GET)
    @ApiOperation(value="随机找题①",notes = "通过知识点随机查找查找填空题试题")
    public ResponseResult<List<GapFilling>> findByNameAndLevelId(
            @RequestParam("name") List<String> name,Integer amount){
        List<GapFilling> data =
                gapFillingService
                        .selectByKnowNames(name, amount);
        return new ResponseResult<List<GapFilling>>(SUCCESS,data);
    }
}

