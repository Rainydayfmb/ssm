package cn.springmvc.controller;

import cn.springmvc.model.Document;
import cn.springmvc.service.DocumentService;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @Description：
 * @Author：feipeng
 * @Date: 2017/6/11 21:36
 */
@Controller
public class DocumentController {

    @Resource
    DocumentService documentService;

    @RequestMapping(value="/document/selectDocument")
    public String selectDocument(Integer page,
                                 Integer pageSize,
                                 @ModelAttribute Document document,
                                 ModelMap map){
        System.out.println("document = " + document);
        PageInfo<Document> p=null;
        page=page==null?1:page;
        pageSize=pageSize==null?5:pageSize;
        p=documentService.findDocument(document.getFilename(),page,pageSize);
        map.put("documents",p.getList());
        map.put("pagehelper",p);
        return "document/document";
    }

}
