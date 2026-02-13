package week03.invoice;

public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem){
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity < 0 ? 0 : quantity;
        this.pricePerItem = pricePerItem < 0 ? 0.0 : pricePerItem;
    }

    //partnumber
    public String getPartNumber(){
        return partNumber;
    }

    public void setPartNumber(String partNumber){
        this.partNumber = partNumber;
    }

    //partdescription
    public String getPartDescription(){
        return partDescription;
    }

    public void setPartDescription(String partDescription){
        this.partDescription = partDescription;
    }

    //quantity
    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity < 0 ? 0 : quantity;
    }

    //priceperitem
    public double getPricePerItem(){
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem){
        this.pricePerItem = pricePerItem < 0 ? 0.0 : pricePerItem;
    }

    public double getInvoiceAmount(){
        return quantity * pricePerItem;
    }
}