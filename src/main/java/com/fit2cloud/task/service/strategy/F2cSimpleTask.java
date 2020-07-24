package com.fit2cloud.task.service.strategy;

import com.fit2cloud.task.service.F2cBaseTask;
import com.xxl.job.core.biz.model.ReturnT;

/**
 * @Company: FIT2CLOUD 飞致云
 * @Author: Mr.cyw
 * @Machine: chenyawen
 * @Date: 2020/7/24 5:44 下午
 * @Description: Please Write notes scientifically
 */
public abstract class F2cSimpleTask<T> implements F2cBaseTask<T> {

    @Override
    public ReturnT<T> execute(Object param) throws Exception{
        return executeTask(param);
    }

    /**
     *
     * @param param
     * @return
     * 子类想怎么实现就怎么实现吧
     */
    protected abstract ReturnT<T> executeTask(Object param);
}
