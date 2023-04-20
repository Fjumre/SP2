public class Main {
    public static void main(String[] args) {

    FleetOfCars cars = new FleetOfCars();
    cars.addCar(new DieselCar(15.2, "diesel", "RE 53 511", "Thar", "Mahindra", 2, true));
    cars.addCar(new GasolinCar(22.4, "benzin", "HU 12 908", "Corsa", "Opel", 5));
    cars.addCar(new ElectricCar("TY 55 009", "Ioniq 5", "Hyundai", 5, 58, 384, 384/58));

    int price = cars.totalRegistrationFeeForFleet;
    System.out.println(cars);
        System.out.println(price);
    }
}