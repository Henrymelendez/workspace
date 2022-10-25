package composition_example;

public class EmployeeClient {

    public static void main(String[] args) {
        Employee emp1 = new Employee("Henry", 55000,new Address("Boston","USA"));
        Employee emp2 = new Employee("john", 85000, new Address("Clevland", "USA"));

        System.out.println(emp1.getEmployeeInfo());
        System.out.println(emp2.getEmployeeInfo());
    }
}
