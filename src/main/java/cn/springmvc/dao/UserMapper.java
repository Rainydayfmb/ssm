package cn.springmvc.dao;

import cn.springmvc.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User selectByLoginnameAndPassword(
            @Param("loginName") String loginname,
            @Param("passWord") String password);

    List<User> selectByPage(@Param("name") String name);
}