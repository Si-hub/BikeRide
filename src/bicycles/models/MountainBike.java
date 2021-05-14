package bicycles.models;

import bicycles.BicycleBase;
import bicycles.BicycleType;

public class MountainBike extends BicycleBase {
    //use changeSpeed method from BicycleBase
    public void accelerate() {
        this.changeSpeed(5);
    }

    public void brake() {
        this.changeSpeed(-3);
    }

    @Override
    public int currentSpeed() {
        return this.currentSpeed();
    }

    @Override
    public BicycleType bicycleType() {
        return BicycleType.MountainBike;
    }


}
