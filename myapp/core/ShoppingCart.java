package myapp.core;

import java.io.Console;
import java.util.*;

public class ShoppingCart {
    public static void main(String[] args) {

        List<String> cartList = new LinkedList<String>();
        String input = "list";
        
        //Split method for String will automatically determine the size of array, do not need to declare
        //String[] strArray = new String[10];
        //strArray[0] = "list";

        boolean exist = false;
        
        Console cons = System.console();

        System.out.println("Welcome to your shopping cart");

        while (true) {

            input = cons.readLine("Please enter a command: list, add, delete, end\n");
            String[] strArray = input.split(" ");

            if (strArray[0].equals("list")) {
                
                if (cartList.size() == 0) {
                    System.out.println("The cart is empty");
                } 
                else {
                    for (int i = 0; i < cartList.size(); i++) {
                        System.out.printf("%d. %s\n" , i+1, cartList.get(i));
                    }
                }
            }
            else if (strArray[0].equals("add")) {
                for (int j = 1; j < strArray.length; j++) {
                    for (int i = 0; i < cartList.size(); i++) {
                        if (cartList.get(i).equals(strArray[j])) {
                            System.out.printf("%s already exist in cart\n", cartList.get(i));
                            exist = true;
                        } 
                    }

                    if (!exist) {
                        cartList.add(strArray[j]);
                        System.out.printf("%s added to the cart\n", strArray[j]);
                    }

                    exist = false;
                }
            } 
            else if (strArray[0].equals("delete")) {
                // for (int i = 0; i < cartList.size(); i++) {
                //     if (strArray[1].equals(cartList.get(i))) {
                //         cartList.remove(i);
                //     }
                // }

                int del = Integer.parseInt(strArray[1]);
                if (del-1 < cartList.size()){
                    String removedItem = cartList.get(del-1);
                    cartList.remove(del-1);
                    System.out.printf("%s removed from cart\n" , removedItem);
                } 
                else {
                    System.out.println("Please enter a valid index");
                }

                
            }
            else if (strArray[0].equals("end")) {
                System.out.println("The remaining item in the cart: ");
                for (int i = 0; i < cartList.size(); i++) {
                    System.out.printf("%d. %s\n" , i+1, cartList.get(i));
                }
                break;
            }
        }
    }
}
