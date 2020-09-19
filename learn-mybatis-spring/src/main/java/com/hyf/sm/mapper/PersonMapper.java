package com.hyf.sm.mapper;

import com.hyf.sm.pojo.Person;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PersonMapper {
    Person getPersonById(Integer id);
}