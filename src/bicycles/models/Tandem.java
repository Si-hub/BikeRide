package bicycles.models;

import bicycles.BicycleBase;

public class Tandem extends BicycleBase {

    //use changeSpeed method from BicycleBase
    public void accelerate() {
        this.changeSpeed(12);
    }

    public void brake() {
        this.changeSpeed(-7);
    }
}