package com.newer.springboot.service;

import com.newer.springboot.domain.Admins;
import com.newer.springboot.mapper.AdminsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminsService {

    @Autowired
    private AdminsMapper adminsMapper;



    /**
     * 用户登录
     * @param aname 用户
     * @param pwd 密码
     * @return
     */
    public Admins login(String aname, String pwd){
         return adminsMapper.login(aname,pwd);
    }

    public List<Admins> findAll(){
        return adminsMapper.findAll();
    }
}
