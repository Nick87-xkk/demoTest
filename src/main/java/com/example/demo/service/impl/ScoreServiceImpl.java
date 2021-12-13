package com.example.demo.service.impl;

import com.example.demo.entity.Score;
import com.example.demo.mapper.ScoreMapper;
import com.example.demo.service.IScoreService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author nick
 * @since 2021-12-13
 */
@Service
public class ScoreServiceImpl extends ServiceImpl<ScoreMapper, Score> implements IScoreService {

}
