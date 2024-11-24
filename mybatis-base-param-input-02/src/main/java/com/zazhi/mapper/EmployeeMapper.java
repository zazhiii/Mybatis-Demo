package com.zazhi.mapper;

import com.zazhi.pojo.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface EmployeeMapper {

    // #{} ${} 的区别
    Employee selectEmployee(Integer empId);

    // 传单个简单参数
    int deleteEmployee(Integer empId);

    // 传实体对象
    int insertEmployee(Employee employee);

    // 传多个简单参数
    Employee queryEmployeeByNameAndSalary(@Param("a") String empName, @Param("b") Double empSalary);

    // 传入Map
    int insertEmployeeByMap(Map data);

}
