package com.yizhidou.paper.questionMapper;

import com.yizhidou.paper.entity.Person;
import com.yizhidou.paper.mapper.PersonMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonMapperTest {

    @Autowired
    private PersonMapper Pmapper;

    @Test
    public void findByPid (){
        Integer pid = 1;
        Person person = Pmapper.fingByPid(pid);
        System.out.println(person);
    }

    @Test
    public void text(){
        Integer id = 5;
        Pmapper.deleteByPid(id);
    }
}
