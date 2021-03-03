package com.study.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.study.mapper.BmsBillboardMapper;
import com.study.model.entity.BmsBillboard;
import com.study.service.IBmsBillboardService;
import org.springframework.stereotype.Service;

/**
 * @author xiazhihang
 */
@Service
public class IBmsBillboardServiceImpl  extends ServiceImpl<BmsBillboardMapper, BmsBillboard>
implements IBmsBillboardService {
}
