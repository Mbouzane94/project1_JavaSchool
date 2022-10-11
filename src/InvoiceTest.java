public class InvoiceTest {

    public static void main(String[] args) {
        Product product1 = new Product(1, "Milk", 5.99);
        Product product2 = new Product(2, "Bread", 4.99);
        Product product3 = new Product(3, "Eggs", 3.99);
        Lineitem lineitem1 = new Lineitem(product1,5);
        Lineitem lineitem2 = new Lineitem(product2, 3);
        Lineitem lineitem3 = new Lineitem(product3, 8);
        Invoice invoice1 = new Invoice(lineitem1, lineitem2, lineitem3);

        System.out.printf("Product1 ID = %s \nProduct1 Name = %s \nProduct1 Price = $%.2f%n" ,product1.getId(), product1.getDescription(), product1.getPrice());
        System.out.printf("Product2 ID = %s \nProduct2 Name = %s \nProduct2 Price = $%.2f%n" ,product2.getId(), product2.getDescription(), product2.getPrice());
        System.out.printf("Product3 ID = %s \nProduct3 Name = %s \nProduct3 Price = $%.2f%n" ,product3.getId(), product3.getDescription(), product3.getPrice());
        System.out.printf("Lineitem1 product = %s \nLineitem1 Quantity = %d \nLineitem1 Total Value = $%.2f%n" ,lineitem1.getProduct().getDescription(), lineitem1.getQuantity(), lineitem1.getTotal());
        System.out.printf("Lineitem2 product = %s \nLineitem2 Quantity = %d \nLineitem2 Total Value = $%.2f%n" ,lineitem2.getProduct().getDescription(), lineitem2.getQuantity(), lineitem2.getTotal());
        System.out.printf("Lineitem3 product = %s \nLineitem3 Quantity = %d \nLineitem3 Total Value = $%.2f%n" ,lineitem3.getProduct().getDescription(), lineitem3.getQuantity(), lineitem3.getTotal());
        System.out.printf("Invoice1 Lineitems = %s\n                     %s\n                     %s\n" , invoice1.getLineitem1().getProduct().getDescription(), invoice1.getLineitem2().getProduct().getDescription(), invoice1.getLineitem3().getProduct().getDescription());
        System.out.printf("Invoice1 Total = $%.2f%n", invoice1.getInvoiceTotal());

        System.out.println("Updated Invoices with new products");

        product1.setDescription("Pepsi");
        product1.setPrice(3.99);
        product2.setDescription("Coke");
        product2.setPrice(3.99);
        product3.setDescription("Dr.Pepper");
        product3.setPrice(3.99);
        lineitem1.setQuantity(10);
        lineitem2.setQuantity(-1); // Will set quantity to 0, due to the negative number.
        lineitem3.setQuantity(-2);
        System.out.printf("Lineitem1 product = %s \nLineitem1 Quantity = %d \nLineitem1 Total Value = $%.2f%n" ,lineitem1.getProduct().getDescription(), lineitem1.getQuantity(), lineitem1.getTotal());
        System.out.printf("Lineitem2 product = %s \nLineitem2 Quantity = %d \nLineitem2 Total Value = $%.2f%n" ,lineitem2.getProduct().getDescription(), lineitem2.getQuantity(), lineitem2.getTotal());
        System.out.printf("Lineitem3 product = %s \nLineitem3 Quantity = %d \nLineitem3 Total Value = $%.2f%n" ,lineitem3.getProduct().getDescription(), lineitem3.getQuantity(), lineitem3.getTotal());
        System.out.printf("Invoice1 Lineitems = %s\n                     %s\n                     %s\n" , invoice1.getLineitem1().getProduct().getDescription(), invoice1.getLineitem2().getProduct().getDescription(), invoice1.getLineitem3().getProduct().getDescription());
        System.out.printf("New Invoice1 Total = $%.2f%n", invoice1.getInvoiceTotal());
    }
}
