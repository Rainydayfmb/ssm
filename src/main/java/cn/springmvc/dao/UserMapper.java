package cn.springmvc.dao;

import cn.springmvc.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    int updateByPrimaryKeySelective(User record);

    void updateUser(User user);

    User selectByLoginnameAndPassword(
            @Param("loginName") String loginname,
            @Param("passWord") String password);

    List<User> selectByPage(@Param("userName") String userName,@Param("status") Integer status);

    User selectById(@Param("id") Integer id);

    void deleteById(Integer id);
}