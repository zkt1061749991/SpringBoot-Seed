package com.xuanxuan.csu.web;

import com.xuanxuan.csu.core.Result;
import com.xuanxuan.csu.core.ResultGenerator;
import com.xuanxuan.csu.model.Ask;
import com.xuanxuan.csu.service.AskService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by zhixuan chen on 2018/10/11.
*/
@RestController
@RequestMapping("/ask")
public class AskController {
    @Resource
    private AskService askService;

    @PostMapping
    public Result add(@RequestBody Ask ask) {
        askService.save(ask);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        askService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody Ask ask) {
        askService.update(ask);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        Ask ask = askService.findById(id);
        return ResultGenerator.genSuccessResult(ask);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Ask> list = askService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
