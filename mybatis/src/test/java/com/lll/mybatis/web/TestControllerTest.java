package com.lll.mybatis.web;

import com.lll.mybatis.mapper.MyMapper;
import com.lll.mybatis.pojo.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.swing.*;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestControllerTest {
    @Autowired
    private MyMapper mapper;

    @Test
    public void test() {
        mapper.save(new Person(2,"玫瑰"));
    }
}