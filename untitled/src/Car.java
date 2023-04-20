
public interface Car {
    String registrationNumber = "";
    String make = "";

    String model = "";
    int numberOffDoors = 0;
    float registrationFee = 0;

    public default String getRegistrationNumber() {

        return registrationNumber;
    }

    public default String getModel() {

        return model;
    }

    public default String getMake() {
        return make;
    }

    public default int getNumberOffDoors() {
        return numberOffDoors;
    }
    public default float getRegistrationFee() {
        return registrationFee;
    }
}
