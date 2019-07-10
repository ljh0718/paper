package com.yizhidou.paper.service;

import com.yizhidou.paper.entity.PaperResult;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 试卷提交答案接口
 */
public interface IPaperResultsService {

    /**
     * 插入答案
     */
    void insertPaperResult(List<String> results, HttpSession session);

}

