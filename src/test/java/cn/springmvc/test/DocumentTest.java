package cn.springmvc.test;

import cn.springmvc.dao.DocumentMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @Description：
 * @Author：feipeng
 * @Date: 2017/5/18 23:02
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath:conf/spring.xml","classpath:conf/spring-mybatis.xml"})
public class DocumentTest {

    @Resource
    private DocumentMapper documentMapper;

    @Test
    public void  testSelectById(){
        System.out.println(documentMapper.selectByPrimaryKey(1));
    }
}
