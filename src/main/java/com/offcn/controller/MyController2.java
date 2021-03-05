package com.offcn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController2 {
    @GetMapping("/indexPage")
    public String indexPage(Model model){
        //new ModelAndView();
        model.addAttribute("message","hello-thymeleaf");
        System.out.println("=========进入了控制层");
        return "index";
    }
}
