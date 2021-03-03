package com.study.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.study.model.entity.BmsBillboard;
import com.study.model.entity.BmsTip;
import org.springframework.stereotype.Repository;

/**
 * @author xiazhihang
 */
@Repository
public interface BmsTipMapper extends BaseMapper<BmsTip> {
     BmsTip getRandomTip();
}
