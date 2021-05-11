package bicycles.models;

import bicycles.BicycleBase;

public class RoadBike extends BicycleBase {

    //use changeSpeed method from BicycleBase
    public void accelerate() {
        this.changeSpeed(11);
    }

    public void brake() {
        this.changeSpeed(-4);
    }

}
