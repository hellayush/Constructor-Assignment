public class Car {
    private String brand;
    private String model;
    private int year;

    
    public Car() {
    
        brand = "Toyota";
        model = "Corolla";
        year = 2020;
    }

    
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {
    
        Car myCar = new Car();

    
        myCar.displayInfo();
    }
}
