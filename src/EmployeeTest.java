public class EmployeeTest {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Matthew", "Bouzane", 10000);
        Employee employee2 = new Employee("Olivia", "Kuster", 15000);

        System.out.printf("Employee One First Name: %s, Employee One Last Name: %s Employee One Monthly Salary: $%.2f%n: ", employee1.getFirstName() , employee1.getLastName() , employee1.getMonthlySalary());
        System.out.printf("Employee Two First Name: %s, Employee Two Last Name: %s Employee Two Monthly Salary: $%.2f%n: ", employee2.getFirstName() , employee2.getLastName() , employee2.getMonthlySalary());

        System.out.printf("Employee One's Yearly Salary = $%.2f%n", (employee1.getMonthlySalary() * 12));
        System.out.printf("Employee two's Yearly Salary = $%.2f%n", (employee2.getMonthlySalary() * 12));

        System.out.println("Give a 10% raise to each Employee");
        employee1.setMonthlySalary(employee1.getMonthlySalary() * 1.1);
        employee2.setMonthlySalary(employee2.getMonthlySalary() * 1.1);

        System.out.printf("Employee One's Yearly Salary = $%.2f%n", (employee1.getMonthlySalary() * 12));
        System.out.printf("Employee two's Yearly Salary = $%.2f%n", (employee2.getMonthlySalary() * 12));
    }
}
