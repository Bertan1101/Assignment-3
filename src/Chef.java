public class Chef extends Staff {

    private String specialty;
    public Chef(int id, String name, double salary, int experienceYears, String specialty) {
        super(id, name, salary, experienceYears);
        setSpecialty(specialty);
    }

    public void setSpecialty(String specialty) {
        if (specialty == null || specialty.trim().isEmpty()) {
            throw new IllegalArgumentException("Specialty cannot be empty");
        }
        this.specialty = specialty;
    }

    @Override
    public void work() {
        System.out.println("Chef cooks " + specialty + " dishes");
    }

    @Override
    public String getRole() {
        return "Chef";
    }
}
