public class Employee {
    private String name;
    private int id;
    private String department;
    private double salary;

    // Constructor to initialize employee object
    public  Employee(String name, int id, String department, double salary){
        this.name = name;
        this.id = id;
        this.department = department;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayEmployeeDetail(){
        System.out.println("Employee Id : " + id);
        System.out.println("Name: " + name);
        System.out.println("Department : " + department);
        System.out.println("Salary : " + salary + "fcfa");
    }

    // Method to give raise
    public  void giveRaise(double raiseAmount){
        this.salary += raiseAmount;
        System.out.println(name + " received a raise of " + raiseAmount +
                "fcfa" + ". New Salary : " + salary + "fcfa");
    }
}
