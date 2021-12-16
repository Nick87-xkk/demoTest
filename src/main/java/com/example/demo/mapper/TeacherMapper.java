package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.entity.Teacher;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author nick
 * @since 2021-12-13
 */
public interface TeacherMapper extends BaseMapper<Teacher> {
    IPage<Teacher> findTeacherAll(Page page);
    boolean addTeacher(int tid,String tname);
    boolean deleteTeacherById(int tid);
}
