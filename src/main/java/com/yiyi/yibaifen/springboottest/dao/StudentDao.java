package com.yiyi.yibaifen.springboottest.dao;

import com.yiyi.yibaifen.springboottest.model.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentDao extends YiYiMapper<Student>{
    /**
     * 查询学生
     */
    List<Student> selectStudent();

    /**
     * 删除学生
     */
    boolean deleteStudent(Long id);

    /**
     * 修改学生
     */
    boolean updateStudent(Student student);

    /**
     * 新增学生
     */
    boolean insertStudent(Student student);

}
