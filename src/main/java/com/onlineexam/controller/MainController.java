package com.onlineexam.controller;

import com.onlineexam.model.StudentEntity;
import com.onlineexam.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/5/12.
 */
@Controller
public class MainController {

    // 自动装配数据库接口，不需要再写原始的Connection来操作数据库
    @Autowired
    StudentRepository studentRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String login() {
        return "admin/login";
    }

    @RequestMapping(value = "/admin/logout", method = RequestMethod.GET)
    public String logout() {
        return "admin/login";
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/students/student", method = RequestMethod.GET)
    public  String getUsers(ModelMap modelMap) {
        System.out.printf("请求了这里");
        // 查询user表中所有记录
        List<StudentEntity> studentList = studentRepository.findAll();
        System.out.print("studentList||size:"+studentList.size());
        // 将所有记录传递给要返回的jsp页面，放在userList当中
        modelMap.addAttribute("studentList", studentList);

        // 返回pages目录下的students/student.jsp页面
        return "students/student";
    }

    // get请求，访问添加用户 页面
    @RequestMapping(value = "/students/student/add", method = RequestMethod.GET)
    public String addStudent() {
        // 转到 admin/addStudent.jsp页面
        return "students/addStudent";
    }

    // post请求，处理添加用户请求，并重定向到用户管理页面
    @RequestMapping(value = "/students/student/addP", method = RequestMethod.POST)
    public String addStudentPost(@ModelAttribute("StudentEntity") StudentEntity studentEntity) {
        // 注意此处，post请求传递过来的是一个UserEntity对象，里面包含了该用户的信息
        // 通过@ModelAttribute()注解可以获取传递过来的'user'，并创建这个对象

        // 数据库中添加一个用户，该步暂时不会刷新缓存
        //userRepository.save(studentEntity);

        // 数据库中添加一个用户，并立即刷新缓存
        studentRepository.saveAndFlush(studentEntity);

        // 重定向到用户管理页面，方法为 redirect:url
        return "redirect:/students/student";
    }

    // 查看用户详情
    // @PathVariable可以收集url中的变量，需匹配的变量用{}括起来
    // 例如：访问 localhost:8080/admin/student/show/1 ，将匹配 id = 1
    @RequestMapping(value = "/students/student/show/{id}", method = RequestMethod.GET)
    public String showStudent(@PathVariable("id") Integer studentId, ModelMap modelMap) {

        // 找到Id所表示的用户
        StudentEntity studentEntity = studentRepository.findOne(studentId);

        // 传递给请求页面
        modelMap.addAttribute("student", studentEntity);
        return "students/studentDetail";
    }

    // 更新用户信息 页面
    @RequestMapping(value = "/students/student/update/{id}", method = RequestMethod.GET)
    public String updateUser(@PathVariable("id") Integer studentId, ModelMap modelMap) {

        // 找到studentId所表示的用户
        StudentEntity studentEntity = studentRepository.findOne(studentId);

        // 传递给请求页面
        modelMap.addAttribute("student", studentEntity);
        return "students/updateStudent";
    }

    // 更新用户信息 操作
    @RequestMapping(value = "/students/student/updateP", method = RequestMethod.POST)
    public String updateUserPost(@ModelAttribute("studentP") StudentEntity student) {

        // 更新用户信息
        studentRepository.updateStudent(student.getSname(), student.getSnumber(), student.getSpwd(), student.getSmail(),
                student.getStel(), student.getSaddress(), student.getId());
        studentRepository.flush(); // 刷新缓冲区
        return "redirect:/students/student";
    }

    // 删除用户
    @RequestMapping(value = "/students/student/delete/{id}", method = RequestMethod.GET)
    public String deleteUser(@PathVariable("id") Integer studentId) {

        // 删除id为studentId的用户
        studentRepository.delete(studentId);
        // 立即刷新
        studentRepository.flush();
        return "redirect:/students/student";
    }
}
