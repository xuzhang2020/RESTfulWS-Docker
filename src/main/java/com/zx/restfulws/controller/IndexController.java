package com.zx.restfulws.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class IndexController {
	@RequestMapping("/index")
    public String index(ModelMap map,HttpServletRequest request){
        map.addAttribute("helloword","WELCOME TO MY RESTful WEB SERVICE & DOCKER SAMPLE!");
        map.addAttribute("port", request.getServerPort());
        return "index";
    }
}
