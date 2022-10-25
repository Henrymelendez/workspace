package composition_example;

import java.util.Arrays;

public class Company {
    private String companyName;
    private Employee[] employees = new Employee[100];
    private int employeeCount;

    public Company(String companyName, Employee[] employees) {
        setCompanyName(companyName);
        setEmployees(employees);

    }


    public void addEmployee(Employee employee){

        this.employees[this.employeeCount] = employee;

    }

    public double computeTotalSalaryOfAllEmployees(){

        double total = 0;

        for(Employee emp : this.employees){

            if(emp != null){
                total += emp.getSalary();
            }
        }
        return total;

    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Employee[] getEmployees() {


        return employees;
    }

    public void setEmployees(Employee[] employees) {

        for(Employee emp : employees){
            this.employees[employeeCount] = emp;
            this.employeeCount++;
        }
    }


    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", employees=" + Arrays.toString(employees) +
                '}';
    }
}
