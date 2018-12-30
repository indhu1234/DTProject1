package com.grocerry.services;

import com.grocerry.model.Cart;
import com.grocerry.model.CartItem;
import com.grocerry.model.CustomerOrder;

public interface CartItemService {

	void saveOrUpdateCartItem(CartItem cartItem);
	
	void removeCartItem(int cartItemId);
	
	Cart getCart(int cartId);
	
	CustomerOrder createOrder(Cart cart);
}


