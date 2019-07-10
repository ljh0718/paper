package com.yizhidou.paper.mapper;


import com.yizhidou.paper.entity.GapFilling;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Set;


/**
 * 填空题接口
 */

public interface GapFillingMapper {


        /**
         * 插入填空题试题
         * @param gf
         * @return
         */

        Integer insertGf(GapFilling gf);

        /**
         * 根据gfid删除题目
         * @param id
         * @return
         */

        Integer deleteByGfid(List<Integer> id);

        /**
         * 根据题目id查找题目
         * @param id
         * @return
         */

        List<GapFilling> findByQTid(List<Integer> list);

        /**
         * 查找全部
         * @param list
         * @return
         */
        List<GapFilling> findAll();


        /**
         * 自定义查询数据(某个知识点或某个难度的全部填空题)
         */

        List<GapFilling> findByknowsAndLevel(
                List<String> knowNames,
                String level);

        /**
         * 通过给定的知识点范围随机取出指定的题目数量
         * @param knowNames
         * @param amount
         * @return
         */
        List<GapFilling> findByknows(
                List<String> knowNames,Integer amount);
}

