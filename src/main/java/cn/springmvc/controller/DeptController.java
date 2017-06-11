package cn.springmvc.controller;

import cn.springmvc.model.Dept;
import cn.springmvc.model.User;
import cn.springmvc.service.DeptService;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * @Description：
 * @Author：feipeng
 * @Date: 2017/6/11 20:00
 */
@Controller
public class DeptController {

    @Resource
    DeptService deptService;

    @RequestMapping(value = "/dept/selectDept")
    public String selectDept(Integer page, Integer pageSize, @ModelAttribute Dept dept, ModelMap map){
        System.out.println("dept = " + dept);
        PageInfo<Dept> p=null;

        page=page==null?1:page;
        pageSize=pageSize==null?5:pageSize;

        p=deptService.findDept(dept,page,pageSize);
        map.put("depts",p.getList());
        map.put("pagehelper",p);
        return "dept/dept";
    }

    @RequestMapping(value="/dept/removeDept")
    public ModelAndView removeDept(String ids, ModelAndView mv){
        // 分解id字符串
        String[] idArray = ids.split(",");
        for(String id : idArray){
            // 根据id删除员工
            deptService.removeUserById(Integer.parseInt(id));
        }
        // 设置客户端跳转到查询请求
        mv.setViewName("redirect:/user/selectUser");
        // 返回ModelAndView
        return mv;
    }

    @RequestMapping(value = "/dept/updateDept")
    public ModelAndView updateDept(String flag, @ModelAttribute Dept dept, ModelAndView mv){
        if(flag.equals("1")){
            // 根据id查询部门
            Dept target = deptService.findDeptById(dept.getId());
            // 设置Model数据
            mv.addObject("dept", target);
            // 设置跳转到修改页面
            mv.setViewName("dept/showUpdateDept");
        }else{
            // 执行修改操作
            deptService.updateDept(dept);
            // 设置客户端跳转到查询请求
            mv.setViewName("redirect:/dept/selectDept");
        }
        // 返回
        return mv;
    }

    @RequestMapping(value="/dept/addDept")
    public ModelAndView addUser(
            String flag,
            @ModelAttribute Dept dept,
            ModelAndView mv){
        if(flag.equals("1")){
            // 设置跳转到添加页面
            mv.setViewName("dept/showAddDept");
        }else{
            // 执行添加操作
            deptService.addDept(dept);
            // 设置客户端跳转到查询请求
            mv.setViewName("redirect:/user/selectUser");
        }
        // 返回
        return mv;
    }
}
