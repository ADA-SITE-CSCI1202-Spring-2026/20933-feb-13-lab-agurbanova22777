package week03.invoice;

public class InvoiceTest {
    public static void main(String[] args) {
        
        Invoice invoice = new Invoice("12345", "Hammer", 10, 15.99);

        
        System.out.println("Part Number: " + invoice.getPartNumber());
        System.out.println("Part Description: " + invoice.getPartDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price Per Item: $" + invoice.getPricePerItem());
        System.out.println("Invoice Amount: $" + invoice.getInvoiceAmount());

        
        invoice.setPartNumber("67890");
        invoice.setPartDescription("Screwdriver");
        invoice.setQuantity(5);
        invoice.setPricePerItem(9.99);

        
        System.out.println("\nUpdated Invoice:");
        System.out.println("Part Number: " + invoice.getPartNumber());
        System.out.println("Part Description: " + invoice.getPartDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price Per Item: $" + invoice.getPricePerItem());
        System.out.println("Invoice Amount: $" + invoice.getInvoiceAmount());

        
        invoice.setQuantity(-3);
        invoice.setPricePerItem(-5.99);

        
        System.out.println("\nAfter Setting Negative Values:");
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price Per Item: $" + invoice.getPricePerItem());
        System.out.println("Invoice Amount: $" + invoice.getInvoiceAmount());
    }
}