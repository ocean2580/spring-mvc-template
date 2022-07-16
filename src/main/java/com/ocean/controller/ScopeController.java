package com.ocean.controller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class ScopeController {
    @RequestMapping("/API") // 单次请求
    public String API(HttpServletRequest request) {
        request.setAttribute("api","monica");
        return "success";
    }

    @RequestMapping("/MAV")
    public ModelAndView MAV() {
        ModelAndView mav= new ModelAndView();
        // model
        mav.addObject("mav", "naya");
        // view
        mav.setViewName("success");
        return mav;
    }

    @RequestMapping("/Model")
    public String M(Model model) {
        model.addAttribute("model","oliver");
        return "success";
    }

    @RequestMapping("/Map")
    public String M(Map<String,Object> map) {
        map.put("map","olivia");
        return "success";
    }

    @RequestMapping("/Session") // 浏览器开闭
    public String Session(HttpSession session) {
        session.setAttribute("session","polo");
        return "success";
    }

    @RequestMapping("/Application") // 服务器开闭
    public String Application(HttpSession session) {
        ServletContext context = session.getServletContext();
        context.setAttribute("application","nano");
        return "success";
    }
}
