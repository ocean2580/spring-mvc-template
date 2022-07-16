package com.ocean.controller;

import com.ocean.entity.User;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/HC")
public class HttpConvertController {
    // 请求报文 -> java对象
    @PostMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String requestBody) {
        System.out.println("requestBody = " + requestBody);
        return "success";
    }

    @RequestMapping(value = "/testRequestEntity")
    public String testRequestEntity(RequestEntity<String> requestEntity) {
        //   整个请求报文信息
        System.out.println("Headers = " + requestEntity.getHeaders());
        System.out.println("Body = " + requestEntity.getBody());
        return "success";
    }

    @RequestMapping("/testResponse")
    public void testResponse(HttpServletResponse httpServletResponse) throws IOException {
        httpServletResponse.getWriter().print("This is HttpServletResponse");
    }

    @RequestMapping("/testResponseBody")
    @ResponseBody   // 直接在跳转页面显示字符串,否则返回视图名称
    public String testResponseBody() {
        return "testResponseBody";
    }

    @RequestMapping("/testUser")
    @ResponseBody   // 转json对象
    public User testUser() {
        return new User("oliver","12321",3344,19,"male","123@yeah.net");
    }

    @RequestMapping("/testAxios")
    @ResponseBody
    public String testAxios(String admin, String pwd) {
        System.out.println("admin = " + admin);
        System.out.println("pwd = " + pwd);
        return "ajax";
    }

}
