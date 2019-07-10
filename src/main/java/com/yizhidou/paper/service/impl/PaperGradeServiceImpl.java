package com.yizhidou.paper.service.impl;

import com.yizhidou.paper.entity.*;
import com.yizhidou.paper.mapper.PaperGradeMapper;
import com.yizhidou.paper.service.IPaperGradeService;
import com.yizhidou.paper.service.IPaperResultsService;
import com.yizhidou.paper.service.IPapersService;
import com.yizhidou.paper.service.ex.UpdateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/**
 * 试卷分数业务层接口实现类
 */

@Service
public class PaperGradeServiceImpl implements IPaperGradeService {

    @Autowired
    PaperGradeMapper paperGradeMapper;

    @Autowired
    IPapersService iPapersService;

    @Autowired
    IPaperResultsService iPaperResultsService;

    @Override
    public void insertPaperTXGrade(List<String> results, PaperGrade grade) {
        int gradeTX = 0;

        HashMap<String,Object> map = iPapersService.findByPid(grade.getPaperId());
        //判断填空选择题分数
        List<Choice> choice = (List<Choice>)map.get("选择题");
        List<GapFilling> gap =(List<GapFilling>)map.get("填空题");
        for(int i =0; i<(choice.size()+gap.size()); i++){
            if(i<choice.size()){
                if(choice.get(i).getQuestionKey().equals(results.get(i))){
                    gradeTX = gradeTX+choice.get(i).getQuestionValue();
                }
            }else {
                if(gap.get(i-choice.size()).getGfKey().equals(results.get(i))){
                    gradeTX = gradeTX+gap.get(i-choice.size()).getGfValue();
                }
            }
        }
        grade.setGradeTx(gradeTX);
        paperGradeMapper.insertSelective(grade);
    }

    /**
     * 插入问答题分数
     * @param grades
     * @param grade
     */
    @Override
    public void updatePaperWDGrade(List<Integer> grades,Integer personId,PaperGrade grade) {
        int gradeWd = 0;
        for(Integer i : grades){
            gradeWd = gradeWd+i;
        }
        grade.setGradeWd(gradeWd);
        grade.setPersonId(personId);
        Integer rows = paperGradeMapper.updateGradeWd(grade);
        System.out.println(grade);
        if(rows <1){
            throw new UpdateException(
                    "插入数据异常");
        }
    }
}

