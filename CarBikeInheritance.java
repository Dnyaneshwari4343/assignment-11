class Car {
    void start() {
        System.out.println("Car started");
    }
}

class Bike extends Car {
    void ride() {
        System.out.println("Bike is riding");
    }

    public static void main(String[] args) {
        Bike b = new Bike();
        b.start();
        b.ride();
    }
}
