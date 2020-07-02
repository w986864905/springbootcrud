package com.yiyi.yibaifen.springboottest.service;

import com.yiyi.yibaifen.springboottest.model.Student;

import java.util.List;

public interface StudentService {

    /**
     *查询学生
     */
    List<Student> selectStudent();

    /**
     *删除学生
     */
    boolean deleteStudent(Long id);

    /**
     *修改学生
     */
    boolean updateStudent(Student student);

    /**
     *新增学生
     */
    boolean insertStudent(Student student);
}
