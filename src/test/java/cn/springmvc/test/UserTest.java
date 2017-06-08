package cn.springmvc.test;

import cn.springmvc.dao.DeptMapper;
import cn.springmvc.dao.UserMapper;
import cn.springmvc.model.User;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;

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

    @Resource
    private UserMapper userMapper;
    @Test
    public void addUser(){

    }

    @Test
    public void selectByNameAndPassWord(){
        System.out.println(userMapper.selectByLoginnameAndPassword("admin","123456"));

    }

    @Test
    public void selectDeptByPageService(){
        PageInfo<User> PI=userService.findUser("",2,2);
        for(User user:PI.getList()){
            System.out.println(user);
        }
        //System.out.println(userService.findUser("",2,2));
    }

}
