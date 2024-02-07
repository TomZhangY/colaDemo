package com.alibaba.demo.valid;

import jdk.internal.joptsimple.internal.Strings;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class IntervalRangeValidatorImpl implements ConstraintValidator<IntervalRangeValidator, String> {

    protected long maxSplit;

    @Override
    public void initialize(IntervalRangeValidator validator) {
        this.maxSplit = validator.value();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (!Strings.isNullOrEmpty(value)) {
            String[] result = value.split(",");
            // 不能超过最大长度
            if (result.length > maxSplit) {
                return false;
            }
            // 必须为正整数
            for (int i = 0; i < result.length; i++) {
                try {
                    long v = Long.parseLong(result[i]);
                    if (v <= 0L) {
                        return false;
                    }
                } catch (Exception e) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
