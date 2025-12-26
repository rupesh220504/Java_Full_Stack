package Day2;


abstract class VehicleAbstraction {

	abstract void start();

}

class Car extends VehicleAbstraction {
    void start() {
        System.out.println("Car starts with key");
    }
}

class Bike extends VehicleAbstraction {
    void start() {
        System.out.println("Bike starts with kick");
    }

    public static void main(String[] args) {
    	VehicleAbstraction v;

        v = new Car();
        v.start();

        v = new Bike();
        v.start();
    }
}
