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
    PageInfo<Dept> findDept(String name,int pageNum,int PageSize);
}
