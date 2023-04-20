
abstract class AFuelCar extends ACar{
    String fueltype;
    double kmPrLitre;

    public AFuelCar(double kmPrLitre, String fueltype, String registrationNumber, String model, String make, int numberOffDoors){
        super(registrationNumber, model, make, numberOffDoors);
        this.kmPrLitre= kmPrLitre;
        this.fueltype= fueltype;

}

    public String getFuelType(){
        return fueltype;
    }

    double getKmPrLitre(){
        return kmPrLitre;
    }
    @Override
    public String toString(){
        return "Fuel type: "+ this.fueltype +" km pr litre: "+ this.kmPrLitre;
    }
}
