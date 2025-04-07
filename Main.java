class Vehicle {
    public void displayInfo() {
        System.out.println("Vehicle Information");
    }
}
class Car extends Vehicle {
    String carModel;
    String carCompany;
    int seatingCapacity;
    boolean isPetrol;
    public Car(String carModel, String carCompany, int seatingCapacity, boolean isPetrol) {
        this.carModel = carModel;
        this.carCompany = carCompany;
        this.seatingCapacity = seatingCapacity;
        this.isPetrol = isPetrol;
    }
    public void displayInfo() {
        System.out.println("Car Information:");
        System.out.println("Model: " + carModel);
        System.out.println("Company: " + carCompany);
        System.out.println("Seating Capacity: " + seatingCapacity);
        System.out.println("Runs on Petrol: " + (isPetrol ? "Yes" : "No"));
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Tesla Model 3", "Tesla", 5, false);
        myCar.displayInfo();
    }
}
