package com.zazhi.mapper;

import com.zazhi.pojo.Teacher;

public interface TeacherMapper {

    // 非自增长的主键回显
    int insertTeacher(Teacher teacher);
}
