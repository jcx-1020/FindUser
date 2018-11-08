package org.westos.controller;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.westos.entity.User;
import org.westos.mapper.UserMapper;

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
