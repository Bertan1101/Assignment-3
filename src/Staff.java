public abstract class Staff {

    protected int id;
    protected String name;
    protected double salary;
    protected int experienceYears;

    public Staff(int id, String name, double salary, int experienceYears) {
        setId(id);
        setName(name);
        setSalary(salary);
        setExperienceYears(experienceYears);
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

    public void setSalary(double salary) {
        if (salary <= 0) {
            throw new IllegalArgumentException("Salary must be greater than zero");
        }
        this.salary = salary;
    }

    public void setExperienceYears(int experienceYears) {
        if (experienceYears < 0) {
            throw new IllegalArgumentException("Experience cannot be negative");
        }
        this.experienceYears = experienceYears;
    }

    public abstract void work();
    public abstract String getRole();
}
