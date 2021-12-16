package com.example.demo.controller;


import com.example.demo.service.IScoreService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author nick
 * @since 2021-12-13
 */
@RestController
@RequestMapping("/score")
public class ScoreController {
    @Resource
    IScoreService iScoreService;

}
