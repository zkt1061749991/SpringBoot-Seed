package com.xuanxuan.csu.service.impl;

import com.xuanxuan.csu.dao.AskMapper;
import com.xuanxuan.csu.model.Ask;
import com.xuanxuan.csu.service.AskService;
import com.xuanxuan.csu.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by zhixuan chen on 2018/10/11.
 */
@Service
@Transactional
public class AskServiceImpl extends AbstractService<Ask> implements AskService {
    @Resource
    private AskMapper askMapper;

}
