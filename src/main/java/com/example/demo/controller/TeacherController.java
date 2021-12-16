package com.example.demo.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.entity.Teacher;
import com.example.demo.service.ITeacherService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author nick
 * @since 2021-12-13
 */
@RestController
@RequestMapping("/teacher")
public class TeacherController {
    @Resource
    ITeacherService iTeacherService;

    @CrossOrigin
    @GetMapping("/getTeacher")
    public IPage<Teacher> getTeacher(Page page) {
        return iTeacherService.findTeacherAll(page);
    }

    @CrossOrigin
    @PostMapping("/setTeacher")
    public Object setTeacher(int tid,String tname){
        Teacher teacher = new Teacher();
        teacher.setTid(tid);
        teacher.setTname(tname);
        iTeacherService.save(teacher);
        return teacher;
    }
}
