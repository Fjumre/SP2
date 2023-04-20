
public class DieselCar extends AFuelCar {

    boolean particleFilter;

    public DieselCar(double kmPrLitre, String fueltype, String registrationNumber, String model, String make, int numberOffDoors, boolean particleFilter) {
        super(kmPrLitre, fueltype, registrationNumber, model, make, numberOffDoors);
        this.particleFilter = particleFilter;
    }
    public boolean particleFilter() {
        if (particleFilter == true) {
            return true;
        } else {
            return false;
        }
    }
    public float getRegistrationFee() {
        int price = 0;
        if (kmPrLitre > 20 && kmPrLitre < 50) {
            price = 130;
        } else if (kmPrLitre > 15 && kmPrLitre < 20) {
            price = 1390;
        } else if (kmPrLitre > 10 && kmPrLitre < 15) {
            price = 1850;
        } else if (kmPrLitre > 5 && kmPrLitre < 10) {
            price = 2770;
        } else if (kmPrLitre > 5) {
            price = 15260;
        } if (particleFilter== false){
            price += 1000;
        } return price;
    }

    @Override
    public String toString(){
        return "Particle filter: "+ this.particleFilter +" registration fee: "+ this.registrationFee;
    }
}