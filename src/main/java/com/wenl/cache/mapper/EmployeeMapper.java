package com.wenl.cache.mapper;

import com.wenl.cache.bean.Employee;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface EmployeeMapper {
    @Select("select * from employee where id = #{id}")
    public Employee getEmpById(Integer id);

    @Update("update employee set lastName=#{lastName},email=#{email},gender=#{gender},d_id=#{dId} where id = #{id}")
    public void updateEmp(Employee employee);

    @Delete("delete from employee where id=#{id}")
    public void deleteEmp(Integer id);

    @Insert("insert into employee(lastName,email,gender,d_id) value(#{lastName},#{email},#{gender},#{dId})")
    public void insertEmp(Employee employee);
}
