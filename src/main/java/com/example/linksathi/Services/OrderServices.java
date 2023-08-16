package com.example.linksathi.Services;

import com.example.linksathi.Entity.Order;
import com.example.linksathi.Pojo.OrderPojo;

import java.util.List;

public interface OrderServices {
    OrderPojo save(OrderPojo orderPojo);
    List<Order> findOrderById(Integer id);

    List<Order> findAll();

    Order findById(Integer id);
    void deleteById(Integer id);
}
