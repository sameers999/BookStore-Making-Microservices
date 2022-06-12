package com.bridgelabz.order_service.model;

import com.bridgelabz.order_service.dto.OrderDTO;
import lombok.Data;

import javax.persistence.*;
import java.awt.print.Book;
import java.time.LocalDate;

@Entity
@Data
@Table(name="orderDetails")
public class Order {
    @Id
    @GeneratedValue
    private Integer orderID;
    private LocalDate date = LocalDate.now();
    private Integer price;
    private Integer quantity;
    private String address;
    private Integer userId;
    private Integer bookId;
    private boolean cancel;

    public Order() {
        super();
    }

    public Order(OrderDTO dto) {
        super();
        this.quantity = dto.getQuantity();
        this.address = dto.getAddress();
        this.userId = dto.getUserId();
        this.bookId = dto.getBookId();
        this.cancel = dto.isCancel();
    }
}
