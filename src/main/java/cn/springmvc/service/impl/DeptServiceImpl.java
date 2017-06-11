package cn.springmvc.service.impl;

import cn.springmvc.dao.DeptMapper;
import cn.springmvc.model.Dept;
import cn.springmvc.service.DeptService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description：
 * @Author：feipeng
 * @Date: 2017/5/19 23:28
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Resource
    private DeptMapper deptMapper;

    public PageInfo<Dept> findDept(Dept dept, int pageNum, int pageSize) {

        PageHelper.startPage(pageNum,pageSize);
        List<Dept> list=deptMapper.selectByPage(dept.getName());
        PageInfo<Dept> pi=new PageInfo<Dept>(list);
        return pi;
    }

    @Override
    public void removeUserById(Integer id) {
        deptMapper.deleteById(id);
    }

    @Override
    public Dept findDeptById(Integer id) {
        return deptMapper.selectById(id);
    }

    @Override
    public void updateDept(Dept dept) {
        deptMapper.updateDept(dept);
    }

    @Override
    public void addDept(Dept dept) {
        deptMapper.insert(dept);
    }
}
