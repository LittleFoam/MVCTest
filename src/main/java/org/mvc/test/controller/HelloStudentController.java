package org.mvc.test.controller;

import org.mvc.test.model.HelloStudent;
import org.mvc.test.service.HelloStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = {"helloStudent", "/"})
public class HelloStudentController {
    @Autowired
    private HelloStudentService service;

    @RequestMapping(value = {"welcome", "/"})
    @ResponseBody
    public List<HelloStudent> welcome() {
        return service.welcome();
    }

    @RequestMapping("jsTest")
    public String jsTest() {
        return "jsTest";
    }
}
