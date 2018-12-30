package com.grocerry.dao;

import com.grocerry.model.Cart;
import com.grocerry.model.CartItem;
import com.grocerry.model.CustomerOrder;

public interface CartItemDao {
	
	void SaveOrUpdateCartItem(CartItem cartItem);
	
	void removeCartItem(int cartItemId);
	
	Cart getCart(int cartId);
	
	CustomerOrder createOrder(Cart cart);

}
