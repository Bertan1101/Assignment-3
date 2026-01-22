public class HouseholdProduct extends Product {

    private String usageType;

    public HouseholdProduct(int id, String name, double price, int quantity, String usageType) {
        super(id, name, price, quantity);
        setUsageType(usageType);
    }

    public void setUsageType(String usageType) {
        if (usageType == null || usageType.isEmpty()) {
            throw new IllegalArgumentException("Usage type required");
        }
        this.usageType = usageType;
    }

    @Override
    public String getCategory() {
        return "Household (" + usageType + ")";
    }
}
