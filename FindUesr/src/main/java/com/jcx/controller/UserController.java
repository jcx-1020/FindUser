package com.jcx.controller;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.jcx.entity.User;
import com.jcx.mapper.UserMapper;

import java.util.List;

@Controller
public class UserController {

    @RequestMapping("/select")
    public String select(Model model) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        UserMapper mapper = context.getBean(UserMapper.class);
        List<User> users = mapper.findAll();
        model.addAttribute("users", users);
        return "select";
    }
}
