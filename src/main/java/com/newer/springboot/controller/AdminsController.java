package com.newer.springboot.controller;

import com.newer.springboot.domain.Admins;
import com.newer.springboot.domain.CustomErrorInfo;
import com.newer.springboot.service.AdminsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:8080",maxAge = 64000)
@RequestMapping("/api")
public class AdminsController {

    @Autowired
    private AdminsService adminsService;

    /**
     * 用户登录
     * @param aname
     * @param pwd
     * @return
     */
    @GetMapping("/login")
    public ResponseEntity<?> login(@RequestParam("aname")String aname,
                                   @RequestParam("pwd")String pwd){
       Admins admins =  adminsService.login(aname,pwd);
       if(admins==null){
           return new ResponseEntity<>(new CustomErrorInfo("用户名获取密码错误"),HttpStatus.OK);
       }
       return new ResponseEntity<>(admins,HttpStatus.OK);
    }


}
