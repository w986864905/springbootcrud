package com.yiyi.yibaifen.springboottest.controller;

import com.yiyi.yibaifen.springboottest.model.Student;
import com.yiyi.yibaifen.springboottest.model.TbUser;
import com.yiyi.yibaifen.springboottest.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@Api(tags = "学生管理相关接口")
@RequestMapping(value = "student/")
public class StudentViewController {

    @Autowired
    private StudentService studentService;

    /**
     *查询学生
     */
    @GetMapping("list")
    @ApiOperation("查询用户的接口")
    public List<Student> select(){
        return studentService.selectStudent();
    }

    /**
     *删除学生
     */
    @PostMapping("delete")
    @ApiOperation("根据id删除用户的接口")
    public boolean delete(@RequestBody Map param){
        return studentService.deleteStudent(Long.valueOf(String.valueOf(param.get("id"))));
    }

    /**
     *修改学生
     */
    @ApiOperation("修改用户的接口")
    @PostMapping(value="update")
    public boolean update(@RequestBody Student student){
        return studentService.updateStudent(student);
    }

    /**
     *插入学生
     */
    @ApiOperation("新增用户的接口")
    @PostMapping("insert")
    public boolean insert(@RequestBody Student student){
        return studentService.insertStudent(student);
    }

}
