package com.xuanxuan.csu.service.impl;

import com.xuanxuan.csu.dao.UserMapper;
import com.xuanxuan.csu.model.User;
import com.xuanxuan.csu.service.UserService;
import com.xuanxuan.csu.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by zhixuan chen on 2018/10/11.
 */
@Service
@Transactional
public class UserServiceImpl extends AbstractService<User> implements UserService {
    @Resource
    private UserMapper userMapper;

}
