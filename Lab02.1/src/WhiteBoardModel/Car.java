package WhiteBoardModel;

public class Car {

    private String brand;
    private String model;
    private int year;


    public Car(){

    }

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }



    public void turnOn(){

        System.out.println("Turning on " + brand);
    }

    public void turnOff(){

        System.out.println("Turn off the car ");
    }

    public void drive(){

        System.out.println("Driving the " + brand + " " + model );
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
