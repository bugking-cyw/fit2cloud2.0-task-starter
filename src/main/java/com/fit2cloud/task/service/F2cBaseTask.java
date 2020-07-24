package com.fit2cloud.task.service;

import com.xxl.job.core.biz.model.ReturnT;

/**
 * @Company: FIT2CLOUD 飞致云
 * @Author: Mr.cyw
 * @Machine: chenyawen
 * @Date: 2020/7/24 2:52 下午
 * @Description: Please Write notes scientifically
 */
public interface F2cBaseTask<T> {
    ReturnT<T> execute(Object param) throws Exception;
}
