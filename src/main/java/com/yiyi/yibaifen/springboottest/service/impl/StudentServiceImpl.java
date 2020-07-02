package com.yiyi.yibaifen.springboottest.service.impl;

import com.yiyi.yibaifen.springboottest.dao.StudentDao;
import com.yiyi.yibaifen.springboottest.model.Student;
import com.yiyi.yibaifen.springboottest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;


    @Override
    public List<Student> selectStudent() {
        return studentDao.selectStudent();
    }

    @Override
    public boolean deleteStudent(Long id) {
        return studentDao.deleteStudent(id);
    }

    @Override
    public boolean updateStudent(Student student) {
        return studentDao.updateStudent(student);
    }

    @Override
    public boolean insertStudent(Student student) {
        return studentDao.insertStudent(student);
    }
}
