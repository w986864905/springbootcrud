package com.yiyi.yibaifen.springboottest.controller;

import com.yiyi.yibaifen.springboottest.model.TbUser;
import com.yiyi.yibaifen.springboottest.service.TbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "tbUser/")
public class TbUserViewController {

    @Autowired
    private TbUserService userService;

    @PostMapping(value = "saveTbUser")
    public int saveTbUser(@RequestBody TbUser user){
        return userService.insertTbUser(user);
    }

}
