package bicycles.specification;

import bicycles.BicycleBase;
import bicycles.BicycleType;

public class BicycleFromSpec extends BicycleBase {
    public BicycleSpecification bicycleSpec;

    public BicycleFromSpec(BicycleSpecification bicycleSpec){
        this.bicycleSpec = bicycleSpec;
    }


    public void accelerate(){
        changeSpeed(this.bicycleSpec.getAccelerationSpeed());
    }

    public void brake(){
        changeSpeed(this.bicycleSpec.getBrakeSpeed());

    }


    public BicycleType getBicycleType() {
        return this.bicycleSpec.getBicycleType();
    }

    public int getCurrent() {
        return currentSpeed();
    }

}
