package TryoutsAgain;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Cart {
    private static String ownerName = "default";
    private final ArrayList<Item> ITEMS = new ArrayList<>();

    public Cart(String ownerName) {
        Cart.ownerName = ownerName;
    }

    public String getOwnerName() {
        return Cart.ownerName;
    }

    public void add(Item item) {
        ITEMS.add(item);
    }

    public BigDecimal calculateTotalPrice() {
        BigDecimal total = BigDecimal.ZERO;
        for (Item item : ITEMS) {
            total = total.add(item.calculateTotal());
        }
        return total;
    }

    public BigDecimal calculateVAT(float percentage) {
        return calculateTotalPrice().multiply(BigDecimal.valueOf(percentage / 100.0));
    }

    @Override
    public String toString() {
        StringBuilder stringToReturn = new StringBuilder();
        for (Item item : ITEMS) {
            stringToReturn.append(item.toString()).append("\n");
        }
        return stringToReturn.toString();
    }
}
