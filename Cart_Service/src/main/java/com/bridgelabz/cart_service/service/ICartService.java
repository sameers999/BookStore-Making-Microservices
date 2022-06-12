package com.bridgelabz.cart_service.service;

import com.bridgelabz.cart_service.dto.CartDTO;
import com.bridgelabz.cart_service.model.Cart;

import javax.validation.Valid;
import java.util.List;

public interface ICartService {
    Cart insertToCart(@Valid CartDTO dto);

    List<Cart> getAllCarts();

    Cart getCartByID(Integer cartId);

    Cart updateById(Integer cartId, @Valid CartDTO dto);

    Cart deleteById(Integer cartId);
}
