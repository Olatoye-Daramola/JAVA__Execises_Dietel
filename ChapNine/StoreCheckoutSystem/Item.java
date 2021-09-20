package TryoutsAgain;


import java.math.BigDecimal;

public class Item {
    private final String NAME;
    private final BigDecimal PRICE;
    private final int QUANTITY;

    public Item(String name, BigDecimal price, int quantity) {
        this.NAME = name;
        this.PRICE = price;
        this.QUANTITY = quantity;
    }

    BigDecimal calculateTotal() {
        return PRICE.multiply(BigDecimal.valueOf(QUANTITY));
    }

    @Override
    public String toString() {
        return NAME + "\t\t\t" + PRICE + "\t\t" + QUANTITY;
    }
}
