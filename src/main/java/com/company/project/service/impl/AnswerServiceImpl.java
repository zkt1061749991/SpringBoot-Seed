package com.company.project.service.impl;

import com.company.project.dao.AnswerMapper;
import com.company.project.model.Answer;
import com.company.project.service.AnswerService;
import com.company.project.core.AbstractService;
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
