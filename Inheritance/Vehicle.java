class BaseVehicle {
    String brand;
    int speed;

    BaseVehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
    }

    void start() {
        System.out.println(brand + " is starting");
    }
}

class Car extends BaseVehicle {
    int doors;

    Car(String brand, int speed, int doors) {
        super(brand, speed);
        this.doors = doors;
    }

    void showCarInfo() {
        displayInfo();
        System.out.println("Doors: " + doors);
    }
}

class Bike extends BaseVehicle {
    boolean hasGear;

    Bike(String brand, int speed, boolean hasGear) {
        super(brand, speed);
        this.hasGear = hasGear;
    }

    void showBikeInfo() {
        displayInfo();
        System.out.println("Has Gear: " + hasGear);
    }
}

public class Vehicle {
    public static void main(String[] args) {
        Car car = new Car("BMW", 250, 4);
        Bike bike = new Bike("Yamaha", 180, true);

        car.start();
        car.showCarInfo();

        System.out.println();

        bike.start();
        bike.showBikeInfo();
    }
}