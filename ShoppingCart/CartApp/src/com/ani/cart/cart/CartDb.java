package com.ani.cart.cart;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.ani.cart.exception.CartNotFoundException;
import com.ani.cart.exception.ItemNotFoundException;
import com.ani.cart.item.Item;
import com.ani.cart.item.ItemDb;
import com.ani.cart.user.User;
import com.ani.cart.user.UsersDb;

public class CartDb {

    private static final ArrayList<Cart> carts = new ArrayList<>();

    public static void addCart(int cartId, int userId) {

        User user = UsersDb.findUserById(userId);

        Cart cart = new Cart();
        cart.setId(cartId);
        cart.setUser(user);
        carts.add(cart);
    }

    public static void addItemToCart(int userId, int itemId) {

        User user = UsersDb.findUserById(userId);
        Cart cart = user.getCart();

        Item item = ItemDb.findItemById(itemId);

        cart.getItems().add(item);
    }

    public static List<Cart> allCarts() {
        return carts;
    }

    public static List<Item> findItemsByCartId(int cartId) {
        return findCartById(cartId).getItems();
    }

    public static Cart findCartById(int cartId) {
        for( Cart cart : carts) {
            if(cart.getId() == cartId) {
                return cart;
            }
        }
        throw new CartNotFoundException("❌ Cart Id " + cartId +" Not Found");
    }
    public static Cart findItem(int itemId){
        for( Cart cart :carts){
            if(cart.getId()==itemId){
                return cart;
            }
        }
        throw new ItemNotFoundException("❌ Item Id " + itemId +" Not Found");
    }


    public static void removeItem(int userId, int itemId){
        User user = UsersDb.findUserById(userId);
        Cart cart = user.getCart();

        Cart item = CartDb.findItem(itemId);

        cart.getItems().remove(item);
    }

}
