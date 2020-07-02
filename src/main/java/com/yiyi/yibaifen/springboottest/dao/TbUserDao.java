package com.yiyi.yibaifen.springboottest.dao;

import com.yiyi.yibaifen.springboottest.model.TbUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface TbUserDao extends YiYiMapper<TbUser> {
      int insert(TbUser tbUser);
}
