public class Waiter extends Staff {

    private int tablesAssigned;
    public Waiter(int id, String name, double salary, int experienceYears, int tablesAssigned) {
        super(id, name, salary, experienceYears);
        setTablesAssigned(tablesAssigned);
    }

    public void setTablesAssigned(int tablesAssigned) {
        if (tablesAssigned <= 0) {
            throw new IllegalArgumentException("Tables must be greater than zero");
        }
        this.tablesAssigned = tablesAssigned;
    }

    @Override
    public void work() {
        System.out.println("Waiter serves " + tablesAssigned + " tables");
    }
    @Override
    public String getRole() {
        return "Waiter";
    }
}
