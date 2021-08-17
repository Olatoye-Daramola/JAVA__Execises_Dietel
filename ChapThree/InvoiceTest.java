package TryOuts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTest {
    Invoice sales = new Invoice("AO123", "Desc", 1, 250);

    @Test
    public void invoiceCannotTakeNegativeQuantityTest(){
        sales.setPartNumber("AX321");
        sales.setPartDescription("iPhone case");
        sales.setQuantityOfItem(-3);
        sales.setPricePerItem(7_500.42);

        assertEquals(0, sales.getQuantityOfItem());
    }

    @Test
    public void invoiceCannotTakeNegativePriceTest(){
        sales.setPartNumber("AX321");
        sales.setPartDescription("iPhone case");
        sales.setQuantityOfItem(3);
        sales.setPricePerItem(-7_500.42);

        assertEquals(0, sales.getPricePerItem());
    }

    @Test
    public void invoiceCannotProduceNegativeInvoiceAmountTest(){
        sales.setPartNumber("AX321");
        sales.setPartDescription("iPhone case");
        sales.setQuantityOfItem(-3);
        sales.setPricePerItem(-7_500.42);

        assertEquals(0, sales.getInvoiceAmount());
    }
}