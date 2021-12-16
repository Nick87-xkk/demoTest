package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.demo.entity.Course;
import com.example.demo.mapper.CourseMapper;
import com.example.demo.service.ICourseService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author nick
 * @since 2021-12-13
 */
@Service
public class CourseServiceImpl extends ServiceImpl<CourseMapper, Course> implements ICourseService {

    @Override
    public IPage<Course> findCourseAll(IPage page) {
        return baseMapper.findCourseAll(page);
    }

    @Override
    public boolean deleteCourseById(int cid) {
        return baseMapper.deleteCourseById(cid);
    }

    @Override
    public boolean addCourse(int cid, String cname, int tid) {
        return baseMapper.addCourse(cid, cname, tid);
    }
}
