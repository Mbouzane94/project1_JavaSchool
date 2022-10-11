public class Employee {

    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
    }
    // Gets the First Name
    public String getFirstName() {
        return firstName;
    }
    // Sets a New First Name
    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }

    // Gets the Last Name
    public String getLastName() {
        return lastName;
    }
    // Sets a New Last Name
    public void setLastName(String newLastName) {
        this.lastName = newLastName;
    }

    public Double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double newMonthlySalary) {
        if (newMonthlySalary >= 0) {
            this.monthlySalary = newMonthlySalary;
        }
    }
}
