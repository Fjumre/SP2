
public class ElectricCar extends ACar{

    int batteryCapacity;
    int maxRangeKm;
    int whPrKm;

    public ElectricCar(String registrationNumber, String model, String make, int numberOffDoors, int batteryCapacity, int maxRangeKm, int whPrKm) {
        super(registrationNumber, model, make, numberOffDoors);
        this.batteryCapacity= batteryCapacity;
        this.maxRangeKm = maxRangeKm;
        this.whPrKm= this.batteryCapacity/this.maxRangeKm;
    }

    public int getBatteryCapacity() {

        return batteryCapacity;
    }

    public int getMaxRangeKm(){

       return maxRangeKm;
    }

    public int getWhPrKm(){
        return whPrKm;
    }

    public float getRegistrationFee(){
        double kmL = (this.whPrKm / 91.25) / 100;
        int price =0;
        if (kmL>20 && 50<kmL){
            price=330;
        } else if (kmL>15 && 20<kmL){
            price = 1050;
        } else if (kmL>10 && 15<kmL){
            price= 2340;
        } else if (kmL>5 && 10<kmL){
            price=5500;}
        if (kmL>5){
            price=10470;}
        return price;
    }
    @Override
    public String toString(){
        return "ElectricCar "+ "Battery capacity: "+ this.batteryCapacity +" max range in km: "+ this.maxRangeKm +" electricity uses pr km: "+ this.whPrKm +" and registration fee: "+ this.registrationFee;
    }
}
