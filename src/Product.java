public abstract class Product {

    protected int id;
    protected String name;
    protected double price;
    protected int quantity;

    public Product(int id, String name, double price, int quantity) {
        setId(id);
        setName(name);
        setPrice(price);
        setQuantity(quantity);
    }

    public void setId(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("ID must be positive");
        }
        this.id = id;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be greater than zero");
        }
        this.price = price;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative");
        }
        this.quantity = quantity;
    }

    public abstract String getCategory();

    public void sell(int amount) throws InvalidProductException {
        if (amount <= 0) {
            throw new InvalidProductException("Amount must be positive");
        }
        if (amount > quantity) {
            throw new InvalidProductException("Not enough products in stock");
        }
        quantity -= amount;
    }

    @Override
    public String toString() {
        return id + " | " + name + " | " + price + " | " + quantity + " | " + getCategory();
    }
}
