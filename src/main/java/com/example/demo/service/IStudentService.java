package com.example.demo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.entity.Student;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author nick
 * @since 2021-06-22
 */
public interface IStudentService extends IService<Student> {
    IPage<Student> findStudentAll(Page page);
    Student findStudentByIds(int studentId);
//    boolean updateStudent(int id,String name,int age,String sex,String snativeplace,String smajor,String sclass,String snative);
    boolean deleteStudentById(int sid);
    boolean updateStudent(int sid, String sname, String sage, String ssex, String snativeplace, String smajor, String sclass, String snative);
}
