package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.entity.Student;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author nick
 * @since 2021-06-22
 */

public interface StudentMapper extends BaseMapper<Student> {
    IPage<Student> findStudentAll(Page page);

    Student findStudentByIds(int studentId);

    boolean deleteStudentById(int sid);

    boolean updateStudent(int sid, String sname, String sage, String ssex, String snativeplace, String smajor, String sclass, String snative);
//    boolean updateStudent(int id,String name,int age,String sex,String snativeplace,String smajor,String sclass,String snative);
}
