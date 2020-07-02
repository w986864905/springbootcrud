package com.yiyi.yibaifen.springboottest.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 学生类
 */
@Data
@ApiModel(value = "学生主体类")
public class Student implements Serializable {
    /**
     * 学生ID
     */
    @ApiModelProperty(value = "学生ID")
    private long studentId;

    /**
     *学生姓名
     */
    @ApiModelProperty(value = "学生姓名")
    private String studentName;

    /**
     *学生年龄
     */
    @ApiModelProperty(value = "学生年龄")
    private String studentYear;

    /**
     *学生电话
     */
    @ApiModelProperty(value = "学生电话")
    private String studentTel;

    /**
     *学生身份证
     */
    @ApiModelProperty(value = "学生身份证")
    private String studentNum;

    /**
     *学生民族
     */
    @ApiModelProperty(value = "学生民族")
    private String studentType;

    /**
     *学生性别
     */
    @ApiModelProperty(value = "学生性别")
    private String studentSex;

    /**
     *学生婚姻状态
     */
    @ApiModelProperty(value = "学生婚姻状态")
    private String studentState;

    /**
     *学生学校
     */
    @ApiModelProperty(value = "学生学校")
    private String studentSchool;

    /**
     *学生班级
     */
    @ApiModelProperty(value = "学生班级")
    private String studentClass;

    /**
     *学生专业
     */
    @ApiModelProperty(value = "学生专业")
    private String studentPro;

    /**
     *学生辅导员
     */
    @ApiModelProperty(value = "学生辅导员")
    private String studentTeacher;

    /**
     *学生宿舍
     */
    @ApiModelProperty(value = "学生宿舍")
    private String studentDorm;

    /**
     *学生爱好
     */
    @ApiModelProperty(value = "学生爱好")
    private String studentHobby;


}
