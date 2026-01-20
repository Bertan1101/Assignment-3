public class FoodProduct extends Product {

    private String expirationDate;

    public FoodProduct(int id, String name, double price, int quantity, String expirationDate) {
        super(id, name, price, quantity);
        setExpirationDate(expirationDate);
    }

    public void setExpirationDate(String expirationDate) {
        if (expirationDate == null || expirationDate.trim().isEmpty()) {
            throw new IllegalArgumentException("Expiration date cannot be empty");
        }
        this.expirationDate = expirationDate;
    }

    @Override
    public void displayInfo() {
        System.out.println(name + " | expires: " + expirationDate);
    }

    @Override
    public String getCategory() {
        return "Food";
    }
}
