package com.xuanxuan.csu.service.impl;

import com.xuanxuan.csu.dao.AnswerMapper;
import com.xuanxuan.csu.model.Answer;
import com.xuanxuan.csu.service.AnswerService;
import com.xuanxuan.csu.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by zhixuan chen on 2018/10/11.
 */
@Service
@Transactional
public class AnswerServiceImpl extends AbstractService<Answer> implements AnswerService {
    @Resource
    private AnswerMapper answerMapper;

}
