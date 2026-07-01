
class Problem1 {
    public static void main(String[] args) {
        
        Product product1 = new Product("P001", "Laptop", 1200.00, 10);
        System.out.println("Actual Product Price: $" + product1.getPrice());
        product1.applyDiscount(10);
        System.out.println("Product Price after discount: $" + product1.getPrice());
        System.out.println("Product Quantity: " + product1.getQuantity());
    }
}

class Product{
    private String id;
    private String name;
    private double price;
    private int quantity;

    Product(String id, String name, double price, int quantity){
        setId(id);
        setName(name);
        setPrice(price);
        setQuantity(quantity);
    }

    public void applyDiscount(double percentage) {
        if (percentage < 0 || percentage > 100) {
            System.out.println("Invalid discount percentage.");
            return;
        }
        price -= price * (percentage / 100);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {

        this.price = price < 0 ? 0 : price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity < 0 ? 0 : quantity;
    }

}