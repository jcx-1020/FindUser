package test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.westos.entity.User;
import org.westos.mapper.UserMapper;
import org.westos.service.UserService;

import java.util.List;

public class TestSpring {


    static ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

    @Test
    public void test1(){
        UserMapper mapper = context.getBean(UserMapper.class);
        List<User> users = mapper.findAll();
        for (User user : users) {
            System.out.println(user);
        }
    }
}
