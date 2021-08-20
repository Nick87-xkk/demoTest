package com.example.demo.mapper;

import com.example.demo.entity.Usr;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author nick
 * @since 2021-06-24
 */
public interface UsrMapper extends BaseMapper<Usr> {
    Usr findUsrByIds(int usrid);
}
