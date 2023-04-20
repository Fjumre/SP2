public abstract class ACar implements Car {
    String registrationNumber;
    String model;
    String make;
    int numberOffDoors;

    public ACar (String registrationNumber, String model, String make, int numberOffDoors){
        this.registrationNumber = registrationNumber;
        this.model = model;
        this.make = make;
        this.numberOffDoors= numberOffDoors;
    }

    public String getRegistrationNumber() {

        return registrationNumber;
    }

    public String getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }
    public int getNumberOffDoors() {
        return numberOffDoors;
    }
    public String toString(){
        return "Registration number: "+ this.registrationNumber +" make: "+ this.make +"model: "+ this.model +"number off doors"+ this.numberOffDoors;
    }
}