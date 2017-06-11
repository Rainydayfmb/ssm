package cn.springmvc.dao;

import cn.springmvc.model.Dept;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeptMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Dept record);

    int insertSelective(Dept record);

    Dept selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Dept record);

    int updateByPrimaryKey(Dept record);

    List<Dept> selectByPage(@Param("name") String name);

    void deleteById(Integer id);

    Dept selectById(Integer id);

    void updateDept(Dept dept);
}