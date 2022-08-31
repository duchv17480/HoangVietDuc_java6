package com.ph17480.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.ph17480.entities.Order;

import java.util.List;

public interface OrderService {

    public Order create(JsonNode orderData);

    public Order findById(Long id);

    List<Order> findByUsername(String username);
}
