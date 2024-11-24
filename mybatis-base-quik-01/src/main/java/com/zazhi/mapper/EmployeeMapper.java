package com.zazhi.mapper;

import com.zazhi.pojo.Employee;

/**
 * t_emp表对应数据库SQL语句映射接口!
 *    接口只规定方法,参数和返回值!
 *    mapper.xml中编写具体SQL语句!
 */
public interface EmployeeMapper {

    /**
     * 根据员工id查询员工数据方法
     * @param empId  员工id
     * @return 员工实体对象
     */
    Employee selectEmployee(Integer empId);


    /**
     * 根据员工id删除员工数据方法
     * @param empId  员工id
     * @return 删除的记录数
     */
    int deleteEmployee(Integer empId);
}