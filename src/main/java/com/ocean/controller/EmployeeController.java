package com.ocean.controller;

import com.ocean.dao.EmployeeDao;
import com.ocean.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.Collection;

@Controller
@RequestMapping("/pageE")
public class EmployeeController {

    @Resource
    private EmployeeDao employeeDao;

    @RequestMapping(value = "/employee",method = RequestMethod.GET)
    public String getAllEmployee(Model model) {
        Collection<Employee> list = employeeDao.getAll();
        model.addAttribute("employeeList",list);
        return "emp_list";
    }


    @RequestMapping(value = "/employee/{id}", method = RequestMethod.DELETE)
    public String deleteEmployee(@PathVariable("id")Integer id) {
        employeeDao.delete(id);
        return "redirect:/pageE/employee";
    }



    @RequestMapping( "/toAdd")
    public String add() {
        return "emp_add";
    }

    @RequestMapping(value = "/addEmployee" ,method = RequestMethod.POST)
    public String addEmployee(Employee employee) {
        employeeDao.save(employee);
        return "redirect:/pageE/employee";
    }



    @RequestMapping(value = "/employee/{id}", method = RequestMethod.GET)
    public String getEmployeeById(@PathVariable("id")Integer id,Model model) {
        Employee employee = employeeDao.get(id);
        model.addAttribute("employee",employee);
        return "/emp_update";
    }

    @RequestMapping(value = "/updateEmployee",method = RequestMethod.PUT)
    public String updateEmployee(Employee employee) {
        employeeDao.save(employee);
        return "redirect:/pageE/employee";
    }
}
