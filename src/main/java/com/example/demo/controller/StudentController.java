package com.example.demo.controller;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.entity.Student;
import com.example.demo.service.IStudentService;
import com.example.demo.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author nick
 * @since 2021-06-22
 */
@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {
    @Autowired
    IStudentService iStudentService ;
    @CrossOrigin
    @GetMapping("/test")
    public IPage<Student> test( Page page){
        return iStudentService.findStudentAll(page);
    }
    @CrossOrigin
    @GetMapping("/idtest")
    public Student findId(int id){
        return iStudentService.findStudentByIds(id);
    }
    @CrossOrigin
    @PostMapping("/addStudent")
    public Object insertStudent(int id,String name,String age,String sex,String snativeplace,String smajor,String sclass,String snative){
        Student student = new Student();
        student.setSid(id);
        student.setSname(name);
        student.setSage(age);
        student.setSsex(sex);
        student.setSnativeplace(snativeplace);
        student.setSmajor(smajor);
        student.setSclass(sclass);
        student.setSnative(snative);
        iStudentService.save(student);
        return student;
    }
    @CrossOrigin
    @PostMapping("/delete")
    public boolean deleteStudent(int sid){
        return iStudentService.deleteStudentById(sid);
    }
    @CrossOrigin
    @PostMapping("/update")
    public boolean updateStudent(int sid,String sname,String sage,String ssex,String snativeplace,String smajor,String sclass,String snative){
        return iStudentService.updateStudent(sid, sname, sage, ssex, snativeplace, smajor, sclass, snative);
    }
}
