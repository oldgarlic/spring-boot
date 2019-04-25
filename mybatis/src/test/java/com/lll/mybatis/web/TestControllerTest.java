package com.lll.mybatis.web;

import com.lll.mybatis.mapper.PersonMapper;
import com.lll.mybatis.pojo.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;



@RunWith(SpringRunner.class)
@SpringBootTest
public class TestControllerTest {

    @Autowired
    private PersonMapper personMapper;

    @Test
    public void test() {
        personMapper.insert(new Person(null,"茉莉"));
    }
}