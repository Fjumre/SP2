

import java.util.ArrayList;

public class FleetOfCars {

    int totalRegistrationFeeForFleet;

    ArrayList<Car> cars = new ArrayList<>();


    void addCar(Car car) {
        cars.add(car);
    }


    public int getTotalRegistrationFeeForFleet() {
        double sum = 0;
        for (int i=0; i< cars.size(); i++){
            sum += cars.get(i).getRegistrationFee();
        }
        System.out.println(sum);
        return (int) sum;
    }

    public String toString() {
        return "Cars: "+ this.cars +" total registration fee: "+ this.totalRegistrationFeeForFleet;
    }
}
