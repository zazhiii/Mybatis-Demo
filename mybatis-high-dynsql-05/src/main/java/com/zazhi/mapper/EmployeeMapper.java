package com.zazhi.mapper;

import com.zazhi.pojo.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


public interface EmployeeMapper {

    // 查询员工信息 -> if标签和where标签的使用
    List<Employee> query(@Param("name") String name, @Param("salary") String salary);

    // 更新员工信息 -> set标签的使用
    int update(Employee employee);

    // 批量查询 -> foreach标签的使用
    List<Employee> queryBatch(List<Integer> ids);

    // 批量删除
    int deleteBatch(List<Integer> ids);

    // 批量插入
    int insertBatch(List<Employee> employees);

    // 批量更新
    int updateBatch(List<Employee> employees);
}