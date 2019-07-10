package com.yizhidou.paper.service.impl;

import com.yizhidou.paper.entity.*;
import com.yizhidou.paper.mapper.PaperQuestionMapper;
import com.yizhidou.paper.mapper.PaperResultMapper;
import com.yizhidou.paper.service.IPaperResultsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.List;


/**
 * 试卷答案业务层接口实现类
 */

@Service
public class PaperResultsServiceImpl implements IPaperResultsService {

    @Autowired
    PaperQuestionMapper Pqmapper;

    @Autowired
    PaperResultMapper paperResultMapper;

    /**
     * 插入问答题用户答案
     * @param result
     * @param session
     */
    @Override
    public void insertPaperResult(List<String> result, HttpSession session) {
        int personId = Integer.valueOf(session.getAttribute("personId").toString());
        int paperId = Integer.valueOf(session.getAttribute("paperId").toString());
        List<QuestionAnswer> list =  Pqmapper.findQAByPid(paperId);
        PaperResult paperResult = new PaperResult();
        //循环插入答案
        for(int i=0; i<list.size(); i++){
            paperResult.setRes(result.get(i));
            paperResult.setQuesId(list.get(i).getQaTypeChoice());
            paperResult.setPaperId(paperId);
            paperResult.setPersonId(personId);
            paperResultMapper.insert(paperResult);
        }

    }
}

