package com.study.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.study.model.entity.BmsBillboard;
import com.study.model.entity.BmsTip;

/**
 * @author xiazhihang
 */
public interface IBmsTipService extends IService<BmsTip> {
    BmsTip getRandomTip();
}
