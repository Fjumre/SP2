

public class GasolinCar extends AFuelCar{
    public GasolinCar(double kmPrLitre, String fueltype, String registrationNumber, String model, String make, int numberOffDoors) {
        super(kmPrLitre, fueltype, registrationNumber, model, make, numberOffDoors);

    }

    public String getFuelType(){
        return fueltype;
    }

    public float getRegistrationFee(){
        int price =0;
        if (kmPrLitre > 20 && kmPrLitre< 50) {
            price = 130;
        } else if (kmPrLitre > 15 && kmPrLitre < 20) {
            price = 1390;
        } else if (kmPrLitre > 10 && kmPrLitre < 15) {
            price = 1850;
        } else if (kmPrLitre > 5 && kmPrLitre < 10) {
            price = 2770;
        } else if (kmPrLitre > 5) {
            price = 15260;
        }
        return price;
    }
@Override
    public String toString(){
        return this.getModel() + this.getMake();
    }
}
