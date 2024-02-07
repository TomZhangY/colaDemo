package com.alibaba.demo.customer;

//@Mapper
public interface CustomerMapper {

  CustomerDO getById(String customerId);
}
