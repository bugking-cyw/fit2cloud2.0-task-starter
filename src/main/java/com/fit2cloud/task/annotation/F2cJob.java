package com.fit2cloud.task.annotation;

import com.xxl.job.core.handler.annotation.XxlJob;
import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.*;

/**
 * @Company: FIT2CLOUD 飞致云
 * @Author: Mr.cyw
 * @Machine: chenyawen
 * @Date: 2020/7/24 3:09 下午
 * @Description: Please Write notes scientifically
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface F2cJob{
    @AliasFor(annotation = XxlJob.class,attribute = "value")
    String value() ;
    @AliasFor(annotation = XxlJob.class,attribute = "init")
    String init() default "";
    @AliasFor(annotation = XxlJob.class,attribute = "destroy")
    String destroy() default "";
}
