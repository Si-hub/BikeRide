package bicycle;

//create abstract class that will implement the Bicycle interface
public abstract class BicycleBase implements Bicycle{
    private int speed;

    /* we create this method to do the process of accelerating and braking once
    * and on both (RoadBike class, Mountain class) we remove repetition
    * of accelerate method code and brake method code.
    *  After removing we call this method (changeSpeed) with "this" keyword with "dot"
    * and assign or change the value of the speed. e.g this.changeSpeed(5);
     */
    protected void changeSpeed(int changeVal) {
        // add the changeVal to speed using if statement
        if ((speed + changeVal) >= 0) {
            speed += changeVal;
        } else {
            stop();
        }
    }

    public int currentSpeed(){
        return speed;
    }

    public void stop(){
        speed = 0;
    }
}
