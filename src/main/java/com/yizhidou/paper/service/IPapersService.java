package com.yizhidou.paper.service;

import com.yizhidou.paper.entity.Papers;

import java.util.HashMap;
import java.util.List;

/**
 * 试卷业务层接口
 */
public interface IPapersService {

    /**
     * 新建试卷
     */
    void insertPap(Papers paper,List<String> names,int amount);

    /**
     * 新建试卷(固定组卷)
     * @param paper 基本试卷属性
     * @param questionId 手动选择出来的题目的id
     */
    void insertPaper(Papers paper,List<Integer> questionId);

    /**
     * 查找全部试卷
     * @return
     */
    List<Papers> findAllPapers();

    HashMap<String,Object> findByPid(Integer pid);
}

