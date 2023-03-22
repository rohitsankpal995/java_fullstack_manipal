package com.ani.cart.user;

import com.ani.cart.input.CartDataInput;
import com.ani.cart.cart.CartController;
import com.ani.cart.cart.CartMenu;



import java.lang.String;

public class UserMenu {

    private final CartDataInput ip;
    private final UserController controller;

    private CartMenu cartMenu;
    private CartController cartController;

    public UserMenu() {
        ip = new CartDataInput();
        controller = new UserController();

        cartMenu = new CartMenu();
        cartController = new CartController();

    }

    private void displayMenu() {
        StringBuilder builder = new StringBuilder();
        builder.append("🔥 User Menu 🔥")
                .append("\n")
                .append("-------------------")
                .append("\n")
                .append("Select Your Choice")
                .append("\n")
                .append("-------------------")
                .append("\n")
                .append("1. New User")
                .append("\n")
                .append("2. List Users")
                .append("\n")
                .append("3. Go To User Cart")
                .append("\n")
                .append("4. Exit")
                .append("\n");

        System.out.println(builder.toString());
    }

    public void performAction() {

        while(true) {
            displayMenu();

            int ch = 0;
            try {
                ch = ip.askForUserChoice();
            } catch (Exception e) {
                System.out.println("\n ❌ Enter Numbers Only \n");
            }

            if(ch >= 4 ) {
                System.out.println("\n 🙏 Thanks for using our services");
                break;
            } else {
                if(ch == 1) {
                    System.out.println("\n 👏 You selected New User \n");
                    try {
                        int id = ip.askForId("Enter User Id");
                        String name = ip.askForName("Enter User Name");
                        controller.createNewUser(id, name);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                if(ch == 2) {
                    System.out.println(" \n 👏 You selected List users \n ");
                    controller.listAllUsers();
                }
                if(ch == 3) {
                    System.out.println(" \n 👏 Entering to User Cart \n ");

                    int userId = ip.askForId("Enter User Id");
                    cartController.setUserId(userId);
                    cartMenu.performAction();
                }
                if(ch ==4){
                    System.out.println(" \n 👏 YOu have succesfully exited \n ");
                }
            }
        }
    }
}