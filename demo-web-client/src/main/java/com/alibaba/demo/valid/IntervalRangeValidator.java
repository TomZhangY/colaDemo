package com.alibaba.demo.valid;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = IntervalRangeValidatorImpl.class)
/**
 * 间隔分析自定义区间校验
 * 例如字符串 "1,2,3,4" 最大的split长度默认为29
 */
public @interface IntervalRangeValidator {

    String message() default "Invalid value";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    /**
     * 默认最大为29个间隔
     *
     * @return
     */
    long value() default 29L;
}
