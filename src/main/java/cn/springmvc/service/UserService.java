package cn.springmvc.service;

import cn.springmvc.model.User;
import com.github.pagehelper.PageInfo;


public interface UserService {

	public int insertUser(User user);

	User login(String loginname,String password);

	PageInfo<User> findUser(String name, int pageNum, int PageSize);
}
