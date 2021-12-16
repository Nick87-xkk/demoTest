package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.entity.Teacher;
import com.example.demo.mapper.TeacherMapper;
import com.example.demo.service.ITeacherService;
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
public class TeacherServiceImpl extends ServiceImpl<TeacherMapper, Teacher> implements ITeacherService {

    @Override
    public IPage<Teacher> findTeacherAll(Page page) {
        return baseMapper.findTeacherAll(page);
    }

    @Override
    public boolean addTeacher(int tid, String tname) {
        return baseMapper.addTeacher(tid, tname);
    }

    @Override
    public boolean deleteTeacherById(int tid) {
        return baseMapper.deleteTeacherById(tid);
    }
}
