package com.yizhidou.paper.questionMapper;

import com.yizhidou.paper.entity.Choice;
import com.yizhidou.paper.entity.GapFilling;
import com.yizhidou.paper.mapper.ChoiceMapper;
import com.yizhidou.paper.mapper.GapFillingMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GapFillingMapperTest {

    @Autowired
    private GapFillingMapper Gmapper;

    @Autowired
    private ChoiceMapper Cmapper;

    @Test
    public void insert() {
        List<Integer> gf = new ArrayList<>();
        gf.add(25);
        gf.add(27);
        System.out.println(gf);
        Gmapper.deleteByGfid(gf);
    }

    @Test
    public void find() {
       List<Integer> l = new ArrayList<>();
       l.add(2);
       l.add(3);
       l.add(7);
       l.add(14);
       List<GapFilling> list = Gmapper.findByQTid(l);
       System.out.println(list);
    }

    @Test
    public void text1() {
       List<String> questionKnows = new ArrayList<>();
       String questionLevel = null;
       List<GapFilling> list = Gmapper.findByknowsAndLevel(questionKnows,questionLevel);
       System.out.println(list.size());
    }

    @Test
    public void text2() {
        List<String> questionKnows = new ArrayList<>();
        questionKnows.add("语文");
        questionKnows.add("数学");
        Integer amount = 20;
        List<GapFilling> list = Gmapper.findByknows(questionKnows,amount);
        System.out.println(list);
    }

    @Test
    public void text3() {
        Choice ch = new Choice();
        ch.setQuestionTypeChoice(22);
        ch.setQuestionContent("选则题22");
        ch.setChoice1("a");
        ch.setChoice2("b");
        ch.setChoice3("c");
        ch.setChoice4("d");
        ch.setQuestionKey("A");
        ch.setQuestionValue(6);
        Cmapper.insertCh(ch);
    }

    @Test
    public void text4() {
        List<Integer> i = new ArrayList<>();
        i.add(2);
        i.add(15);
        Cmapper.deleteByChid(i);
    }
}
