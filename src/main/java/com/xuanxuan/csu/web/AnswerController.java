package com.xuanxuan.csu.web;

import com.xuanxuan.csu.core.Result;
import com.xuanxuan.csu.core.ResultGenerator;
import com.xuanxuan.csu.model.Answer;
import com.xuanxuan.csu.service.AnswerService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by zhixuan chen on 2018/10/11.
*/
@RestController
@RequestMapping("/answer")
public class AnswerController {
    @Resource
    private AnswerService answerService;

    @PostMapping
    public Result add(@RequestBody Answer answer) {
        answerService.save(answer);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        answerService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody Answer answer) {
        answerService.update(answer);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        Answer answer = answerService.findById(id);
        return ResultGenerator.genSuccessResult(answer);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Answer> list = answerService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
