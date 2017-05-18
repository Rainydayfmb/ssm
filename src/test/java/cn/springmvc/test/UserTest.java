package cn.springmvc.test;

import java.awt.List;

import cn.springmvc.dao.DeptMapper;
import cn.springmvc.model.Dept;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.springmvc.model.User;
import cn.springmvc.service.UserService;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath:conf/spring.xml","classpath:conf/spring-mybatis.xml"})
public class UserTest {

    @Resource
	private UserService userService;

    @Resource
    private DeptMapper deptMapper;
	/*@Before
    public void before(){

        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:conf/spring.xml"
                ,"classpath:conf/spring-mybatis.xml"});
        userService = (UserService) context.getBean("userServiceImpl");
    }*/

    @Test
    public void addUser(){
        User user = new User();
        user.setId(4);
        user.setNickname("ÄãºÃ");
        user.setState(2);
        userService.insertUser(user);

    }


}
