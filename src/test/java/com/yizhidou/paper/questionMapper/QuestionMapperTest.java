package com.yizhidou.paper.questionMapper;

import com.yizhidou.paper.entity.GapFilling;
import com.yizhidou.paper.entity.Question;
import com.yizhidou.paper.mapper.GapFillingMapper;
import com.yizhidou.paper.mapper.QuestionMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class QuestionMapperTest {

    @Autowired
    private GapFillingMapper Gmapper;

    @Autowired
    private QuestionMapper Qmapper;

    @Test
    public void insert() {
        List<Integer> gf = new ArrayList<>();
        gf.add(28);
        gf.add(29);
        Gmapper.deleteByGfid(gf);
        Qmapper.deleteByQid(gf);
    }
}
