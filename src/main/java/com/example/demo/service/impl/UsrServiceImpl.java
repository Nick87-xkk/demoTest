package com.example.demo.service.impl;

import com.example.demo.entity.Usr;
import com.example.demo.mapper.UsrMapper;
import com.example.demo.service.IUsrService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author nick
 * @since 2021-06-24
 */
@Service
public class UsrServiceImpl extends ServiceImpl<UsrMapper, Usr> implements IUsrService {

    @Override
    public Usr findUsrByIds(int usrid) {
        return baseMapper.findUsrByIds(usrid);
    }

   /* @Override
    public Usr setUser(String usrName, String passwd,int usrid) {
        return null;
    }*/
}
