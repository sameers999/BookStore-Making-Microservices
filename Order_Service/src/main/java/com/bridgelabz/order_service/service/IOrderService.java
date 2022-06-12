package com.bridgelabz.order_service.service;

import com.bridgelabz.order_service.dto.OrderDTO;
import com.bridgelabz.order_service.model.Order;
import java.util.List;

public interface IOrderService {
    Order insertOrder(OrderDTO dto);

    Order getByID(Integer orderId);

    List<Order> getAll();

    Order updateById(Integer orderId,OrderDTO dto);

    Order deleteById(Integer orderId);
}
