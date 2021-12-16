package com.example.demo.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.demo.entity.Course;
import com.example.demo.service.ICourseService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author nick
 * @since 2021-12-13
 */
@RestController
@RequestMapping("/course")
public class CourseController {
    @Resource
    ICourseService iCourseService;

    @CrossOrigin
    @GetMapping("/getCourseAll")
    public IPage<Course> getCourseAll(IPage page){
       return iCourseService.findCourseAll(page);
    }

    @CrossOrigin
    @PostMapping("/setCourse")
    public Object setCourse(int cid,String cname,int tid){
        return iCourseService.addCourse(cid,cname,tid);
    }

    @CrossOrigin
    @PostMapping("/deleteCourse")
    public boolean deleteCourse(int cid){
        return iCourseService.deleteCourseById(cid);
    }
}
