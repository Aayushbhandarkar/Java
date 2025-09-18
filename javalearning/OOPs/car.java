
public class car {

    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;


    public void drive() {
        System.out.println("CAR IS DRIVING");
        currentFuelInLiters --;
    }

    public void addFuel(float fuel) {
        currentFuelInLiters += fuel;
    }

public float getCurrentFuel() {
    return currentFuelInLiters;
}

}
