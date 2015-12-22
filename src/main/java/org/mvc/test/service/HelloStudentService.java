package org.mvc.test.service;

import org.mvc.test.model.HelloStudent;
import org.mvc.test.repository.HelloStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class HelloStudentService {

    @Autowired
    private HelloStudentRepository repository;

    public List<HelloStudent> welcome() {
        return repository.findAll();
    }
}
