package com.hyf.sm.service.impl;

import com.hyf.sm.mapper.PersonMapper;
import com.hyf.sm.pojo.Person;
import com.hyf.sm.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author baB_hyf
 * @date 2020/05/14
 */
@Service
public class PersonServiceImpl implements IPersonService {

    @Autowired
    private PersonMapper personMapper;

    @Override
    public Person getPersonById(Integer id) {
        return personMapper.getPersonById(id);
    }
}
