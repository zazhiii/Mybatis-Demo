package com.zazhi.mapper;

import com.zazhi.pojo.Employee;

import java.util.Map;
import java.util.List;


public interface EmployeeMapper {

    //如果是DML操作(插入、删除、修改)，返回值是int
    int deleteById(Integer id);

    // 返回值为简单类型
    String selectNameById(Integer id);

    // 返回值为pojo
    Employee selectById(Integer id);

    // 返回值为Map
    Map<String,Object> selectEmpNameAndMaxSalary();

    // 返回值为List
    List<Employee> selectAll();

    // 员工插入
    int insert(Employee employee);


}