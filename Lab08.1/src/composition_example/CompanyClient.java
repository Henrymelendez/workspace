package composition_example;

public class CompanyClient {

    public static void main(String[] args) {

        Employee[] emps = {new Employee("john", 55000, new Address("cleveland", "usa")),
        new Employee("henry", 55000, new Address("boston","usa"))};

        Company company1 = new Company("the company",emps);

        System.out.println(company1.computeTotalSalaryOfAllEmployees());


        company1.addEmployee(new Employee("jack", 10000, new Address("san diego", "usa")));
        System.out.println(company1.computeTotalSalaryOfAllEmployees());
    }
}
