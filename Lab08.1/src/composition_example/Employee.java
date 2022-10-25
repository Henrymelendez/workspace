package composition_example;

public class Employee {

    private String name;
    private double salary;
    private Address address;

    public Employee(String name, double salary, Address address) {
        setName(name);
        setSalary(salary);
        setAddress(address);
    }

    public String getEmployeeInfo(){
        return this.name + " " + "makes " + this.salary + " per year "
                + " and lives at " + this.address.getAddressInfo();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", address=" + address +
                '}';
    }
}
