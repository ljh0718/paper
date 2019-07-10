package com.yizhidou.paper.controller;

import com.yizhidou.paper.entity.Choice;
import com.yizhidou.paper.entity.Question;
import com.yizhidou.paper.service.IChoiceService;
import com.yizhidou.paper.util.ResponseResult;
import com.yizhidou.paper.vo.PaperChoiceVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * 选择题控制器层
 */


@RestController
@RequestMapping(value = "/choice",method = RequestMethod.GET)
@Api(value="选择题题控制类",tags="选择题")
public class ChoiceController extends BaseController{

    @Autowired
    private IChoiceService choiceService;

    @RequestMapping(value = "/addCh",method = RequestMethod.GET)
    @ApiOperation(value="添加",notes = "添加选择题试题")
    public ResponseResult<Void> addCh(PaperChoiceVO vo){
        choiceService.insertCh(vo);
        return new ResponseResult<>(SUCCESS);
    }

    @RequestMapping(value = "/dbi",method = RequestMethod.GET)
    @ApiOperation(value="删除",notes = "删除指定id的选择题题目")
    public ResponseResult<Void> deleteByChid(
            @RequestParam(value ="questionTypeChoice") List<Integer> questionTypeChoice){
        choiceService.deleteByChid(questionTypeChoice);
        return new ResponseResult<>(SUCCESS);
    }

    @RequestMapping(value = "/fa",method = RequestMethod.GET)
    @ApiOperation(value="查找选择题题目",notes = "查找全部选择题题目")
    public ResponseResult<List<Choice>> findAll(){
        List<Choice> data = choiceService.selectAll();
        return new ResponseResult<>(SUCCESS,data);
    }

    @RequestMapping(value = "/fbi",method = RequestMethod.GET)
    @ApiOperation(value="查找选择题题目",notes = "通过题型id查找选择题题目")
    public ResponseResult<List<Choice>> findByGfid(
            @RequestParam("ChIds") List<Integer> ChIds){
        List<Choice> data = choiceService.findById(ChIds);
        return new ResponseResult<>(SUCCESS,data);
    }


    @RequestMapping(value = "/fbn",method = RequestMethod.GET)
    @ApiOperation(value="查找选择题试题",notes = "通过知识点或难度查找选择题试题")
    public ResponseResult<List<Choice>> findByNameAndLevelId(
            @RequestParam("name") List<String> name,String level){
        List<Choice> data =
                choiceService
                        .findContentByNameAndLevel(name, level);
        return new ResponseResult<List<Choice>>(SUCCESS,data);
    }

    @RequestMapping(value = "/rand1",method = RequestMethod.GET)
    @ApiOperation(value="随机找题①",notes = "通过知识点随机查找查找选择题试题")
    public ResponseResult<List<Choice>> findByNameAndLevelId(
            @RequestParam("name") List<String> name,Integer amount){
        List<Choice> data =
                choiceService
                        .selectByKnowNames(name, amount);
        return new ResponseResult<List<Choice>>(SUCCESS,data);
    }
}

