package cn.springmvc.test;

import cn.springmvc.dao.DeptMapper;
import cn.springmvc.model.Dept;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @Description：
 * @Author：feipeng
 * @Date: 2017/5/18 0:17
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:conf/spring-mybatis.xml")
public class DeptTest {

    @Resource
    DeptMapper deptMapper;

    @Test
    public void testinsertTest(){
        Dept dept=new Dept();
        dept.setId(1);
        dept.setName("feipeng");
        dept.setRemark("最牛逼");
        deptMapper.insert(dept);
    }

    @Test
    public void addDept(){
        Dept dept=new Dept();
        dept.setName("aaa");
        dept.setRemark("bbb");
        dept.setId(12);
        deptMapper.insert(dept);

    }
}
