package com.ocean.controller;

import com.ocean.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ParamController {

    // x^2 = y
    @RequestMapping(
            value = {"/testRequestMapping", "/test"},
            method = {RequestMethod.GET,RequestMethod.POST},
            params = {"username","password!=123456"}
    )
    public String testRequestMapping(){
        return "success";
    }

     //获取请求参数
    // 1.RestFul: ./123 -> ./{id} ->  @PathVariable("id") String id,
    @RequestMapping("/testRest/{id}/{username}")
    public String testRest(@PathVariable("id") String id, @PathVariable("username") String username){
        System.out.println("id:"+id+",username:"+username);
        return "success";
    }

    // 2. Servlet API: request.getParameter()
    @RequestMapping("/testServlet")
    public String testServlet(HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username:"+username+",password:"+password);
        return "success";
    }

    // 3. 控制器方法形参： /.(id=123) -> String id,
    @RequestMapping("/testCtrl")
    public String testCtrl(String username, String password){
        System.out.println("username:"+username+",password:"+password);
        return "success";
    }

    // 4. @RequestParam
    @RequestMapping("/testParam")
    public String testParam(@RequestParam(value = "id",defaultValue = "123")String id) {
        System.out.println("id = " + id);
        return "success";
    }

    // 5. Entity: 需要全参构造
    @RequestMapping("/testPojo")
    public String testPOJO(User user){

        System.out.println(user);
        return "success";
    }


}
