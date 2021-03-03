package com.study.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.study.mapper.BmsBillboardMapper;
import com.study.mapper.BmsTipMapper;
import com.study.model.entity.BmsBillboard;
import com.study.model.entity.BmsTip;
import com.study.service.IBmsBillboardService;
import com.study.service.IBmsTipService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author xiazhihang
 */
@Service
public class IBmsTipServiceImpl extends ServiceImpl<BmsTipMapper, BmsTip>
implements IBmsTipService {

    @Resource
    private BmsTipMapper bmsTipMapper;
    @Override
    public BmsTip getRandomTip() {
        return bmsTipMapper.getRandomTip();
    }
}
