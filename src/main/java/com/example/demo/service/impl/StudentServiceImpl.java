package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.entity.Student;
import com.example.demo.mapper.StudentMapper;
import com.example.demo.service.IStudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author nick
 * @since 2021-06-22
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {

    @Override
    public IPage<Student> findStudentAll(Page page) {
        return baseMapper.findStudentAll(page);
    }

    @Override
    public Student findStudentByIds(int studentId) {
        return baseMapper.findStudentByIds(studentId);
    }

    @Override
    public boolean deleteStudentById(int sid) {
        return baseMapper.deleteStudentById(sid);
    }

    @Override
    public boolean updateStudent(int sid, String sname, String sage, String ssex, String snativeplace, String smajor, String sclass, String snative) {
        return baseMapper.updateStudent(sid, sname, sage, ssex, snativeplace, smajor, sclass, snative);
    }


}
