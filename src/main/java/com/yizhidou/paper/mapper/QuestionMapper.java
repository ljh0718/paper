package com.yizhidou.paper.mapper;

import com.yizhidou.paper.entity.Question;

import java.util.List;


/**
 * 题型接口
 */

public interface QuestionMapper {

        /**
         * 插入填空题试题
         * @param gf
         * @return
         */

        Integer insertQuestion(Question question);

        /**
         * 根据gfid删除题目
         * @param id
         * @return
         */

        Integer deleteByQid(List<Integer> id);

}

