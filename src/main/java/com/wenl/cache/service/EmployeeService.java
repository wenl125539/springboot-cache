package com.wenl.cache.service;

import com.wenl.cache.bean.Employee;
import com.wenl.cache.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;

    @Cacheable(cacheNames = "emp",key = "#id")
    public Employee getEmp(Integer id){
        System.out.println("查询id为"+id+"的员工");
        return employeeMapper.getEmpById(id);
    }
}
