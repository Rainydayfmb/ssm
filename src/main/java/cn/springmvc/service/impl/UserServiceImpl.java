package cn.springmvc.service.impl;

import cn.springmvc.dao.UserMapper;
import cn.springmvc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.springmvc.service.UserService;


@Service
public class UserServiceImpl implements  UserService{
	@Autowired
    private UserMapper userMapper;
     
    public int insertUser(User user) {
        // TODO Auto-generated method stub
       return 0;
    }

    public User login(String loginname, String password) {
        return  userMapper.selectByLoginnameAndPassword(loginname, password);
    }

}
 