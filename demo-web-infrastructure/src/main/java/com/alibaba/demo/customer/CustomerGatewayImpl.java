package com.alibaba.demo.customer;

import com.alibaba.demo.domain.customer.Customer;
import com.alibaba.demo.domain.customer.gateway.CustomerGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CustomerGatewayImpl implements CustomerGateway {

    private CustomerMapper customerMapper;

    public Customer getByById(String customerId) {
        CustomerDO customerDO = customerMapper.getById(customerId);
        //Convert to Customer
        return null;
    }
}
