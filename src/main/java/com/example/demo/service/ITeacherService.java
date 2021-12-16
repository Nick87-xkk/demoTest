package com.example.demo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.entity.Teacher;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author nick
 * @since 2021-12-13
 */
public interface ITeacherService extends IService<Teacher> {
    IPage<Teacher> findTeacherAll(Page page);
    boolean addTeacher(int tid,String tname);
    boolean deleteTeacherById(int tid);
}
