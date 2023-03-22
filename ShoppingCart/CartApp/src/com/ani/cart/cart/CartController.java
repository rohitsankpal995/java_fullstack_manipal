package com.ani.cart.cart;

import com.ani.cart.item.Item;

import java.util.List;

public class CartController {

    private int userId;

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void addItemToCart(int itemId) {
        // first find item in items db by its id
        CartDb.addItemToCart(userId, itemId);
    }

    public List<Item> cartItems(int userId) {
        return CartDb.findItemsByCartId(userId);
    }

    public void removeItem(int itemId) {
        CartDb.removeItem(userId,itemId);
    }

}