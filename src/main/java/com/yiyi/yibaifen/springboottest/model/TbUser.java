package com.yiyi.yibaifen.springboottest.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class TbUser implements Serializable {
    private Long userId;
    private String userName;
    private String mobile;
    private String password;
    private Date createTime;
}
