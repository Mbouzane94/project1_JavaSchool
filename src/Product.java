public class Product {

    private int id;
    private String description;
    private double price;

    public Product(int id, String description, double price) {
        if (id > 0) {
            this.id = id;
        }
        this.description = description;

        if (price > 0) {
            this.price = price;
        }
    }
    // id Getter
    public int getId() {
        return id;
    }

    // id Setter
    public void setId(int newId){
        this.id = newId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String newDescription) {
        this.description = newDescription;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }
}
