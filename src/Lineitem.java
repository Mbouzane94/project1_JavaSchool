public class Lineitem {

    private Product product;
    private int quantity;

    public Lineitem(Product product, int quantity) {
        this.product = product;
        if (quantity > 0) {
            this.quantity = quantity;
        }
        else{
            this.quantity = 0;
        }
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product newProduct) {
        this.product = newProduct;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int newQuantity) {
        if (newQuantity > 0) {
            this.quantity = newQuantity;
        } else {
            this.quantity = 0;
        }
    }

    public double getTotal() {
        double price = product.getPrice();
        double total = price * quantity;
        return total;
    }
}
