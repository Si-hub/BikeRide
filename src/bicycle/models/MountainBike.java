package bicycle.models;

import bicycle.BicycleBase;

public class MountainBike extends BicycleBase {

    //use changeSpeed method from BicycleBase
    public void accelerate() {
        this.changeSpeed(5);
    }

    public void brake() {
        this.changeSpeed(-3);
    }



}
