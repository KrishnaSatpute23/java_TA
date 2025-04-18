
abstract class MotorBike {
    abstract void run();

    void fuel() {
        System.out.println("MotorBike uses petrol");
    }
}

class SuperBike extends MotorBike {
    void run() {
        System.out.println("SuperBike runs very fast!");
    }
}

class MountainBike extends MotorBike {
    void run() {
        System.out.println("MountainBike runs on rough terrains!");
    }
}

public class BikeDemo {
    public static void main(String[] args) {
        MotorBike bike1 = new SuperBike();
        MotorBike bike2 = new MountainBike();

        bike1.run();
        bike1.fuel();

        bike2.run();
        bike2.fuel();
    }
}
