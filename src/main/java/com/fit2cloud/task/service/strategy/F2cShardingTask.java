package com.fit2cloud.task.service.strategy;

import com.fit2cloud.task.service.F2cBaseTask;
import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.util.ShardingUtil;

/**
 * @Company: FIT2CLOUD 飞致云
 * @Author: Mr.cyw
 * @Machine: chenyawen
 * @Date: 2020/7/24 5:54 下午
 * @Description: Please Write notes scientifically
 */
public abstract class F2cShardingTask implements F2cBaseTask {

    @Override
    public ReturnT execute(Object param) throws Exception {
        // 分片参数
        ShardingUtil.ShardingVO shardingVO = ShardingUtil.getShardingVo();
        int voIndex = shardingVO.getIndex();
        int voTotal = shardingVO.getTotal();
        return executeTask(param,voIndex,voTotal);
    }

    protected abstract ReturnT executeTask(Object param,int index,int total) throws Exception;
}
