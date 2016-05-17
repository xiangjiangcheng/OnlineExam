package com.onlineexam.controller;

import com.onlineexam.model.TeacherEntity;
import com.onlineexam.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJacksonJsonView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/5/16.
 */
@Controller
public class TeacherController {
    // 自动装配数据库接口，不需要再写原始的Connection来操作数据库
    @Autowired
    TeacherRepository teacherRepository;

    //login
    @RequestMapping(value = "/admin/login2", method = RequestMethod.POST)
    public  @ResponseBody Map<String, Object> login(@ModelAttribute TeacherEntity teacherEntity) {
        TeacherEntity teacherEntity2;
        String tourl = null;
        String tomessage = null;
        Map<String, Object> jsonResponse = new HashMap<String, Object>();


        teacherEntity2 = teacherRepository.findByTname(teacherEntity.getTname());
        if (teacherEntity2 != null) {

            if(teacherEntity2.getTpwd() == teacherEntity.getTpwd()) {
                //登录成功  重定向到主页
                jsonResponse.put("code","1");
                tourl = "/pages/index";
            } else {
                tomessage = "密码错误";
                jsonResponse.put("code","2");

                jsonResponse.put("message",tomessage);
            }
        } else {
            tomessage = "用户名不存在";
            jsonResponse.put("code","3");
            jsonResponse.put("message",tomessage);
            //登录失败  重定向到login
            tourl = "/pages/admin/login";
        }
        jsonResponse.put("tourl",tourl);
//        return "redirect:"+tourl;
        return jsonResponse;
    }

    @RequestMapping(value = "/admin/login", method = RequestMethod.POST)
    public String ajaxLogin(ModelMap model,@ModelAttribute TeacherEntity teacherEntity,HttpServletRequest request, HttpSession session){
//        String errorMessage=loginCommon(model, user, request, session);
        System.out.print(teacherEntity.getTname()+"||"+teacherEntity.getTpwd());
        String errorMessage = "错误提示！";
        String test = "";
        int code = 1;
        String url = "";
        TeacherEntity teacherEntity1;
        //判断该用户是否存在
        teacherEntity1 = teacherRepository.findByTname(teacherEntity.getTname());
        System.out.print(teacherEntity1.getTname()+"||"+teacherEntity1.getTpwd());
        if (teacherEntity1 == null) {
            test="用户不存在";
            code = 2;
            url = "/";
        } else {
            if(!teacherEntity.equals(teacherEntity1.getTpwd())){
                test="密码错误";
                code = 3;
                url = "/";
            } else {
                System.out.print("dddd");
                test="登录成功";
                code = 1;
                //放入session中
                session.setAttribute("admin_teacher",teacherEntity1);
                url = "/index";
            }
        }
        Map map=new HashMap();
        map.put("test",test);
        map.put("error", errorMessage);
        map.put("code",code);
        map.put("admin_teacher2",teacherEntity1);
        model.addAttribute("result", map);
        return "/index";
    }
}
