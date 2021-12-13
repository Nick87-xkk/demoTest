package com.example.demo.controller;


import com.example.demo.entity.Usr;
import com.example.demo.service.IUsrService;
import org.springframework.web.bind.annotation.*;

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
//    登陆的时候查询
    @CrossOrigin
    @GetMapping("/usrfindbyid")
    public Usr findbyid(int usrid){
        return iUsrService.findUsrByIds(usrid);
    }
//    注册
    @CrossOrigin
    @PostMapping("/setUser")
    public Object setUser(String usrName,String passwd,int usrid){
        Usr usr = new Usr();
        usr.setUsername(usrName);
        usr.setPasswd(passwd);
        usr.setUserid(usrid);
        iUsrService.save(usr);
        return usr;
    }
}
