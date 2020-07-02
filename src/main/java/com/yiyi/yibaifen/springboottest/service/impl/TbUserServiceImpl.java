package com.yiyi.yibaifen.springboottest.service.impl;

import com.yiyi.yibaifen.springboottest.dao.TbUserDao;
import com.yiyi.yibaifen.springboottest.model.TbUser;
import com.yiyi.yibaifen.springboottest.service.TbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TbUserServiceImpl implements TbUserService {

    @Autowired
    TbUserDao tbUserDao;

    @Override
    public int insertTbUser(TbUser user) {

        return tbUserDao.insert(user);
    }
}
