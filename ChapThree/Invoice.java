package TryOuts;

public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantityOfItem;
    private double pricePerItem;

    public Invoice(String number, String description, int quantity, double price){
        partNumber = number;
        partDescription = description;
        if(quantity < 0){ quantityOfItem = 0;} else {quantityOfItem = quantity;}
        if(price < 0){pricePerItem = 0;} else {pricePerItem = price;}
    }

    public void setPartNumber(String number){

        partNumber = number;
    }

    public void setPartDescription(String description){
        partDescription = description;
    }

    public void setQuantityOfItem(int quantity){
        if(quantity <= 0){ quantityOfItem = 0;
        } else {
            quantityOfItem = quantity;
        }
    }

    public void setPricePerItem(double price){
        if(price <= 0){pricePerItem = 0;
        } else {
            pricePerItem = price;
        }
    }

    public String getPartNumber(){ return partNumber;}

    public String getPartDescription(){ return partDescription;}

    public int getQuantityOfItem(){return quantityOfItem;}

    public double getPricePerItem(){ return pricePerItem;}

    public double getInvoiceAmount(){ return quantityOfItem * pricePerItem;}

}
