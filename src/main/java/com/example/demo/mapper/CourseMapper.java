package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.demo.entity.Course;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author nick
 * @since 2021-12-13
 */
public interface CourseMapper extends BaseMapper<Course> {
    IPage<Course> findCourseAll(IPage page);
    boolean deleteCourseById(int cid);
    boolean addCourse(int cid,String cname,int tid);
}
