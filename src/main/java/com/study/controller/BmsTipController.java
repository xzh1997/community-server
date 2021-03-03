package com.study.controller;

import com.study.common.api.ApiResult;
import com.study.model.entity.BmsBillboard;
import com.study.model.entity.BmsTip;
import com.study.service.IBmsBillboardService;
import com.study.service.IBmsTipService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author xiazhihang
 */
@RequestMapping("/tip")
@RestController
public class BmsTipController extends BaseController  {
    @Resource
    private IBmsTipService service;

    @GetMapping("/today")
    public ApiResult<BmsTip> getNotices(){
        BmsTip bmsTip =service.getRandomTip();
        System.out.println(bmsTip+"....");
        return ApiResult.success(bmsTip);

    }
}
