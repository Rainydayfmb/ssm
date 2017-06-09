package cn.springmvc.service.impl;

import cn.springmvc.dao.UserMapper;
import cn.springmvc.model.Dept;
import cn.springmvc.model.User;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.springmvc.service.UserService;

import javax.annotation.Resource;
import java.util.List;


@Service
public class UserServiceImpl implements  UserService{
	@Resource
    private UserMapper userMapper;
     
    public int insertUser(User user) {
        // TODO Auto-generated method stub
       return 0;
    }

    public User login(String loginname, String password) {
        return  userMapper.selectByLoginnameAndPassword(loginname, password);
    }

    @Override
    public PageInfo<User> findUser(String name, Integer status, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<User> list=userMapper.selectByPage(name,status);
        PageInfo<User> pi=new PageInfo<User>(list);
        return pi;
    }
}
 