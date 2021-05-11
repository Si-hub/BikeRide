package bicycles.rides;

import bicycles.Bicycle;
import bicycles.BikeRide;


public class BikeRideTwo implements BikeRide {


    public Bicycle bicycle;

    //create a constructor that takes a Bicycle object
    public BikeRideTwo(Bicycle bicycle) {
        this.bicycle = bicycle;

    }

    public void ride(Bicycle bicycle) {
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.accelerate();
    }

    public int currentSpeed(){
        return this.bicycle.currentSpeed();
    }
}
