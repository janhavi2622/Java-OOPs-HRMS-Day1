public class HRSystem {
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee(101, "Janhavi", 30000, 8000);
        Employee emp2 = new PartTimeEmployee(102, "Revati", 20000, 20, 500);

        emp1.displayDetails();
        System.out.println("Total Salary: " + emp1.calculateSalary());

        emp2.displayDetails();
        System.out.println("Total Salary: " + emp2.calculateSalary());
    }
}
