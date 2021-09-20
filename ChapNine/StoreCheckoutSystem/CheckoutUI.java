package TryoutsAgain;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.Scanner;

public class CheckoutUI {
    static Scanner input = new Scanner(System.in);
    private static Cart cart = new Cart("default");

    public static void setUpCart() {
        String cartOwnerName = input("What is the customer's name?");
        cart = new Cart(cartOwnerName);
    }

    private static void addItemToCart() {
        String itemName = input("What did " + cart.getOwnerName() + " buy?");
        BigDecimal itemPrice = new BigDecimal(input("How much does " + itemName + " cost?"));
        int quantity = Integer.parseInt(input("How many " + itemName + " did " + cart.getOwnerName() + " buy?"));

        Item item = new Item(itemName, itemPrice, quantity);
        cart.add(item);
    }

    public static void addItemsToCart() {
        String addMoreItemsToCart = "yes";

        while(Objects.equals(addMoreItemsToCart, "yes")) {
            addItemToCart();
            addMoreItemsToCart = input("Anything else?: ").toLowerCase();
        }
    }

    public static void displayInvoice() {
        System.out.println(cart);
        System.out.println("Your bill is: " + cart.calculateTotalPrice());
        System.out.println("Your VAT of 7.5% is: " + cart.calculateVAT(7.5F));
    }

    private static String input(String prompt) {
        System.out.println(prompt);
        return input.nextLine();
    }

    public static void main(String[] args) {
        setUpCart();
        addItemsToCart();
        displayInvoice();
    }
}
