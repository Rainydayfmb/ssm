package cn.springmvc.service.impl;

import cn.springmvc.dao.DocumentMapper;
import cn.springmvc.model.Document;
import cn.springmvc.model.User;
import cn.springmvc.service.DocumentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description：
 * @Author：feipeng
 * @Date: 2017/6/11 21:38
 */
@Service
public class DocumentServiceImpl implements DocumentService{

    @Resource
    DocumentMapper documentMapper;

    @Override
    public PageInfo<Document> findDocument(String name, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Document> list=documentMapper.selectByPage(name);
        PageInfo<Document> pi=new PageInfo<Document>(list);
        return pi;
    }
}
