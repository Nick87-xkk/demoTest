package com.example.demo.service;

import com.example.demo.entity.Usr;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author nick
 * @since 2021-06-24
 */
public interface IUsrService extends IService<Usr> {
    Usr findUsrByIds(int usrid);
    boolean addUsr(int uid,String uname,String upwd);
}
