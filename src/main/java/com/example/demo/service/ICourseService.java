package com.example.demo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.demo.entity.Course;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author nick
 * @since 2021-12-13
 */
public interface ICourseService extends IService<Course> {
    IPage<Course> findCourseAll(IPage page);
    boolean deleteCourseById(int cid);
    boolean addCourse(int cid,String cname,int tid);
}
