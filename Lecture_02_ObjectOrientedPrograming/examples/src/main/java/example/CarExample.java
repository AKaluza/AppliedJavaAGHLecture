package example;


abstract class Vehicle{
    public void start(){}
}

interface DrowableCar{
    public void turnLeft();
    public void turnRight();
}

class Car extends Vehicle implements DrowableCar {
    // Attributes (encapsulated)
    private String model;
    private String color;

    // Constructor
    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    // Methods (defining behavior)
    @Override
    public void start() {
        System.out.println(color + " " + model + " starting...");
    }


    public void stop() {
        System.out.println(color + " " + model + " stopping.");
    }

    @Override
    public void turnLeft() {

    }

    @Override
    public void turnRight() {

    }
}

// Inheritance: Creating a SportsCar subclass
class SportsCar extends Car {
    // Additional attribute
    private boolean turboEnabled;

    // Constructor
    public SportsCar(String model, String color) {
        super(model, color); // Calls the parent class constructor
        this.turboEnabled = false;
    }

    // Additional method
    public void enableTurbo() {
        this.turboEnabled = true;
        System.out.println("Turbo enabled!");
    }
}

public class CarExample {
    public static void main(String[] args) {
        // Creating objects
        Car myCar = new Car("Honda", "Silver");
        SportsCar mySportsCar = new SportsCar("Ferrari", "Red");

        // Polymorphism: Calling the same method on different objects
        myCar.start();
        mySportsCar.start();
        mySportsCar.enableTurbo();
    }
}
