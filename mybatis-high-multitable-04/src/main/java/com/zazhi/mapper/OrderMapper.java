package com.zazhi.mapper;

import com.zazhi.pojo.Customer;
import com.zazhi.pojo.Order;

public interface OrderMapper {

    Order selectOrderWithCustomer(Integer orderId);

    Customer selectCustomerWithOrderList(Integer customerId);
}