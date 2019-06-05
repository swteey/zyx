package com.newer.springboot.controller;

import com.newer.springboot.service.AdminsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/api")
public class HelloController {

    @Autowired
    private AdminsService adminsService;

    @RequestMapping("hello")
    public String frist(Model model){
        model.addAttribute("admins",adminsService.findAll());
        return "index";
    }
}
