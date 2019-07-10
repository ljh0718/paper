package com.yizhidou.paper.mapper;


import com.yizhidou.paper.entity.Choice;

import java.util.List;


/**
 * 选择题接口
 */

public interface ChoiceMapper {


        /**
         * 插入填空题试题
         * @param gf
         * @return
         */

        Integer insertCh(Choice ch);

        /**
         * 根据gfid删除题目
         * @param id
         * @return
         */

        Integer deleteByChid(List<Integer> id);

        /**
         * 根据题目id查找题目
         * @param id
         * @return
         */

        List<Choice> findByQTid(List<Integer> list);

        /**
         * 查找全部选择题
         * @return
         */
        List<Choice> findAll();

        /**
         * 自定义查询数据(某个知识点或某个难度的全部选择题)
         */

        List<Choice> findByknowsAndLevel(
                List<String> knowNames,
                String level);

        /**
         * 通过给定的知识点范围随机取出指定的题目数量
         * @param knowNames
         * @param amount
         * @return
         */
        List<Choice> findByknows(
                List<String> knowNames, Integer amount);
}

