package com.wenl.cache.contorller;

import com.wenl.cache.bean.Employee;
import com.wenl.cache.service.EmployeeService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/getEmp/{id}")
    public Employee getEmployee(@PathVariable("id")Integer id){
        return employeeService.getEmp(id);
    }
}
