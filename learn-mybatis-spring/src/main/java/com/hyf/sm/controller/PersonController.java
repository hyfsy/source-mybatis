package com.hyf.sm.controller;

import com.hyf.sm.pojo.Person;
import com.hyf.sm.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author baB_hyf
 * @date 2020/05/14
 */
@RestController
public class PersonController {

    @Autowired
    private IPersonService personService;

    @GetMapping(value = "hello/{personId}")
    public Person helloPerson(@PathVariable("personId") Integer personId) {
        return personService.getPersonById(personId);
    }
}
