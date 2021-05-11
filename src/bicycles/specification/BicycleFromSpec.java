package bicycles.specification;

import bicycles.BicycleBase;

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

}
