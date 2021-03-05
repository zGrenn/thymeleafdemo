package com.offcn.controller;

import com.offcn.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
@Controller
public class SeconfThymeleafController {
    @GetMapping("/second")
    public String indexPage(Model model){
        String message = "Hello, Thymeleaf!";
        User u = new User();
        u.setId(1);
        u.setName("优就业");
        u.setAge(18);

        Map<String,Object> map=new HashMap<String, Object>();
        map.put("src1","1.jpg");
        map.put("src2","2.jpg");
        model.addAttribute("message", message);
        model.addAttribute("user", u);
        model.addAttribute("src", map);
        return "index2";
    }
    @GetMapping("/seven")
        public String indexpage(Model model){
        Date date = new Date();
        model.addAttribute("date",date);
        double price = 128.2233D;
        model.addAttribute("price",price);
        String str="Thymeleaf是Web和独立环境的现代服务器端Java模板引擎，能够处理HTML，XML，JavaScript，CSS甚至纯文本。\r\n" +
                "Thymeleaf的主要目标是提供一种优雅和高度可维护的创建模板的方式。为了实现这一点，它建立在自然模板的概念上，将其逻辑注入到模板文件中，不会影响模板被用作设计原型。这改善了设计的沟通，弥补了设计和开发团队之间的差距。\r\n" +
                "Thymeleaf也从一开始就设计了Web标准 - 特别是HTML5 - 允许您创建完全验证的模板，如果这是您需要的\r\n" ;
        model.addAttribute("strText",str);
        String str2 = "JAVA-OFFCN";
model.addAttribute("str2",str2);
return "index7";

    }
}
