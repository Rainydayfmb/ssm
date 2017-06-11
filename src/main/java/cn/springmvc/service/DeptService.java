package cn.springmvc.service;

import cn.springmvc.model.Dept;
import com.github.pagehelper.PageInfo;

/**
 * @Description：
 * @Author：feipeng
 * @Date: 2017/5/19 23:23
 */
public interface DeptService {

    /**
     * 获得所有部门，分页查询
     * @return Dept对象的List集合
     * */
    PageInfo<Dept> findDept(Dept dept,int pageNum,int PageSize);

    void removeUserById(Integer id);

    Dept findDeptById(Integer id);

    void updateDept(Dept dept);

    void addDept(Dept dept);
}
