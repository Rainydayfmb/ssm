package cn.springmvc.service;

import cn.springmvc.model.User;
import com.github.pagehelper.PageInfo;


public interface UserService {

	public int insertUser(User user);

	User login(String loginname,String password);

	PageInfo<User> findUser(String name, Integer status, int pageNum, int PageSize);

	User findUserById(Integer id);

	void modifyUser(User user);

	void removeUserById(Integer id);
}
