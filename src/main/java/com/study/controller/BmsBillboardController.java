package com.study.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.study.common.api.ApiResult;
import com.study.model.entity.BmsBillboard;
import com.study.service.IBmsBillboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author xiazhihang
 */
@RequestMapping("/billboard")
@RestController
public class BmsBillboardController extends BaseController  {
    @Resource
    private IBmsBillboardService service;

    @GetMapping("/show")
    public ApiResult<BmsBillboard> getNotices(){
        List<BmsBillboard> list = service.list();
        System.out.println(list);
        return ApiResult.success(list.get(list.size()- 1));
    }
}
