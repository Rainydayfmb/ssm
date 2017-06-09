package cn.springmvc.controller;

import cn.springmvc.common.HrmConstants;
import cn.springmvc.model.User;
import cn.springmvc.service.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;


@Controller
public class UserController {

    @Resource
    private UserService userService;


    @RequestMapping(value="/login")
    public ModelAndView login(@RequestParam("loginname") String loginname,
                              @RequestParam("password") String password,
                              HttpSession session,
                              ModelAndView mv){
        // 调用业务逻辑组件判断用户是否可以登录
        User user = userService.login(loginname,password);
        if(user != null){
            // 将用户保存到HttpSession当中
            session.setAttribute(HrmConstants.USER_SESSION, user);
            System.out.println("登陆成功");
            // 客户端跳转到main页面
            mv.setViewName("redirect:/main");
        }else{
            // 设置登录失败提示信息
            mv.addObject("message", "Loginname or password is wrong!");
            System.out.println("登陆失败");
            // 服务器内部跳转到登录页面
            mv.setViewName("forward:/loginForm");
        }
        return mv;
    }

    @RequestMapping(value="/user/selectUser")
    public String selectUser(Integer page,
                             Integer pageSize,
                             @ModelAttribute User user,
                             ModelMap map){
        System.out.println("user = " + user);
        PageInfo<User> p=null;
        page=page==null?1:page;
        pageSize=pageSize==null?4:pageSize;
        p=userService.findUser(user.getUsername(),user.getStatus(),page,pageSize);
        map.put("users",p.getList());
        map.put("pagehelper",p);
        return "user/user";

    }
}
