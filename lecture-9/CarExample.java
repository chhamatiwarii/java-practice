class Car {
    int wheels;
    String brand;
    String model;
    String fuel;
    int seats;
    boolean isATaxi;

    public Car(int wheelsCount, String brandName, String modelName, String fuelType, int seatCount, boolean taxiCheck) {
        this.wheels = wheelsCount;
        this.brand = brandName;
        this.model = modelName;
        this.fuel = fuelType;
        this.seats = seatCount;
        this.isATaxi = taxiCheck;
    }
}


public class CarExample {
    public static void main(String[] args) {
        // Car car = new Car();
        // car.wheels = 5;
        // System.out.println(car.wheels);
        // System.out.println(car.brand);
        // System.out.println(car.isATaxi);

        // Car ertiga = new Car();
        // ertiga.wheels = 5;
        // ertiga.brand = "Suzuki";
        // ertiga.model = "Base Model";
        // ertiga.fuel = "Petrol + CNG";
        // ertiga.seats = 7;
        // ertiga.isATaxi = true;

        Car ertiga = new Car(5, "Suzuki", "Base Model", "Petrol + CNG", 7, true);
        System.out.println(ertiga.wheels);
        System.out.println(ertiga.isATaxi);
        System.out.println(ertiga.fuel);
    }
}