package com.ocean.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.DispatcherServlet;

@Controller
public class ViewJumpController {

    @RequestMapping("/forward")
    public String forward() {
        return "forward:/view";
    }

    @RequestMapping("/redirect")
    public String redirect() {
        return "redirect:/view";
    }



}
