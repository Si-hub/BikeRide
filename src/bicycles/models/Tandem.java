package bicycles.models;

import bicycles.BicycleBase;
import bicycles.BicycleType;

public class Tandem extends BicycleBase {

    //use changeSpeed method from BicycleBase
    public void accelerate() {
        this.changeSpeed(12);
    }

    public void brake() {
        this.changeSpeed(-7);
    }

    public BicycleType getBicycleType() {
        return BicycleType.Tandem;
    }
}
