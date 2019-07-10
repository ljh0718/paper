package com.yizhidou.paper.service;

import com.yizhidou.paper.entity.PaperGrade;
import com.yizhidou.paper.entity.PaperResult;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 试卷分数接口
 */
public interface IPaperGradeService {

    /**
     * 计算分数,插入填选题总分数
     */
    void insertPaperTXGrade(List<String> results, PaperGrade grade);

    /**
     * 插入每个用户每张试卷的问答题分数
     * @param grades 问答题各题分数
     * @param personId 需要修改的用户id
     * @param grade
     */
    void updatePaperWDGrade(List<Integer> grades,Integer personId,PaperGrade grade);

}

