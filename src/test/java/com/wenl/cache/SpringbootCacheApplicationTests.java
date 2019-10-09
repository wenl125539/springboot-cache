package com.wenl.cache;

import com.wenl.cache.bean.Employee;
import com.wenl.cache.mapper.EmployeeMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootCacheApplicationTests {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Test
    public void contextLoads() {
        Employee employee = new Employee();
        employee.setEmail("1255391@qq.com");
        employee.setGender(0);
        employee.setdId(1);
        employee.setLastName("wenl");
        employeeMapper.insertEmp(employee);
    }


}
