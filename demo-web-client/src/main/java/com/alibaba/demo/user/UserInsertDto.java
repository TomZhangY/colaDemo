package com.alibaba.demo.user;

import com.alibaba.demo.valid.IntervalRangeValidator;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class UserInsertDto {

    @NotNull
    private String name;

    @NotNull
    private Integer age;

    private String mark;

    /**
     * 区间 类似于 1,2,3,4 代表范围 (0,1) [1,2) [2,3) [3,4) [4,+∞)  最多29个间隔（30个区间）
     */
    @IntervalRangeValidator
    private String range;
}
