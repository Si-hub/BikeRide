package bicycles.specification;

import bicycles.BicycleType;

public class BicycleSpecification {

    private int accelerationSpeed;
    private int brakeSpeed;
    public  BicycleType bicycleType;


    public BicycleSpecification(int accelerationSpeed, int brakeSpeed,  BicycleType bicycleType){
        this.accelerationSpeed = accelerationSpeed;
        this.brakeSpeed = brakeSpeed;
        this.bicycleType = bicycleType;

    }

    //add getters for both variables
    public int getAccelerationSpeed(){
        return accelerationSpeed;
    }

    public BicycleType getBicycleType(){
        return bicycleType;
    }

    public int getBrakeSpeed(){
        return brakeSpeed;
    }
}
