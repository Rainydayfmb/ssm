package cn.springmvc.service;

import cn.springmvc.model.Document;
import com.github.pagehelper.PageInfo;

/**
 * @Description：
 * @Author：feipeng
 * @Date: 2017/6/11 21:38
 */
public interface DocumentService {

    PageInfo<Document> findDocument(String name, int pageNum, int PageSize);

}
