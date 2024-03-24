package Abstration;

abstract class Vehicle {
    protected int speed;

    public Vehicle(int speed) {
        this.speed = speed;
    }

    abstract void accelerate(int increment);
    abstract void brake(int decrement);

    void displaySpeed() {
        System.out.println("Speed: " + speed);
    }
}

class Car extends Vehicle {
    public Car(int speed) {
        super(speed);
    }

    void accelerate(int increment) {
        speed += increment;
        System.out.println("Abstration.Car is accelerating");
    }

    void brake(int decrement) {
        speed -= decrement;
        System.out.println("Abstration.Car is braking");
    }
}

class LuxuryCar extends Vehicle {
    public LuxuryCar(int speed) {
        super(speed);
    }

    void accelerate(int increment) {
        speed += increment;
        System.out.println("Luxury car is accelerating");
    }

    void brake(int decrement) {
        speed -= decrement;
        System.out.println("Luxury car is braking");
    }

    void playMusic() {
        System.out.println("Playing relaxing music");
    }
}

class Bike extends Vehicle {
    public Bike(int speed) {
        super(speed);
    }

    void accelerate(int increment) {
        speed += increment;
        System.out.println("Abstration.Bike is accelerating");
    }

    void brake(int decrement) {
        speed -= decrement;
        System.out.println("Abstration.Bike is braking...");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Car car = new Car(60);
        car.displaySpeed();
        car.accelerate(20);
        car.displaySpeed();
        car.brake(10);
        car.displaySpeed();

        System.out.println();

        LuxuryCar luxuryCar = new LuxuryCar(80);
        luxuryCar.displaySpeed();
        luxuryCar.accelerate(30);
        luxuryCar.displaySpeed();
        luxuryCar.brake(15);
        luxuryCar.displaySpeed();
        luxuryCar.playMusic();

        System.out.println();

        Bike bike = new Bike(30);
        bike.displaySpeed();
        bike.accelerate(10);
        bike.displaySpeed();
        bike.brake(5);
        bike.displaySpeed();
    }
}

