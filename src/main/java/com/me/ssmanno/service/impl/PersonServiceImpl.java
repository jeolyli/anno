package com.me.ssmanno.service.impl;

import com.me.ssmanno.dao.PersonDao;
import com.me.ssmanno.pojo.Person;
import com.me.ssmanno.pojo.PersonQuery;
import com.me.ssmanno.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonDao personDao;

    public List<Person> findAll() {
        PersonQuery ex = new PersonQuery();
        return personDao.selectByExample(ex);
    }
}
