//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Creating employee objects (Hiring employees)
        Employee employee1 = new Employee("Zogo", 1, "Engineering", 6000);
        Employee employee2 = new Employee("Bob", 2, "HR", 4500);

        // Display employee details
        System.out.println("Employee 1 Details : ");
        employee1.displayEmployeeDetail();

        System.out.println("\nEmployee 2 Details : ");
        employee2.displayEmployeeDetail();

        // Give raise to employee 1
        System.out.println("\nGiven raise to employee 1 : ");
        employee1.giveRaise(5000);

        // Display details again after raise
        System.out.println("\nUpdated Employee 1 Details");
        employee1.displayEmployeeDetail();




    }
}