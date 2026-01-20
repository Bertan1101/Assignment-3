public class HouseholdProduct extends Product {

    private String manufacturer;

    public HouseholdProduct(int id, String name, double price, int quantity, String manufacturer) {
        super(id, name, price, quantity);
        setManufacturer(manufacturer);
    }

    public void setManufacturer(String manufacturer) {
        if (manufacturer == null || manufacturer.trim().isEmpty()) {
            throw new IllegalArgumentException("Manufacturer cannot be empty");
        }
        this.manufacturer = manufacturer;
    }

    @Override
    public void displayInfo() {
        System.out.println(name + " | brand: " + manufacturer);
    }

    @Override
    public String getCategory() {
        return "Household";
    }
}
