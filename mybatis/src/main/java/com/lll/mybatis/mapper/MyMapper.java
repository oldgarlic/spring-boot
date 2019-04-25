package com.lll.mybatis.mapper;

import com.lll.mybatis.pojo.Person;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MyMapper {
    @Insert("insert into person1 values(null,#{name})")
    public void save(Person person);
}
