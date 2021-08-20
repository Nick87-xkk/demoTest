package com.example.demo.controller;


import com.example.demo.entity.Usr;
import com.example.demo.service.IUsrService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author nick
 * @since 2021-06-24
 */
@RestController
@CrossOrigin
@RequestMapping("/usr")
public class UsrController {
    @Resource
    IUsrService iUsrService;
    @CrossOrigin
    @GetMapping("/usrfindbyid")
    public Usr findbyid(int usrid){
        return iUsrService.findUsrByIds(usrid);
    }
}
