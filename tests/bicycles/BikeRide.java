package bicycles;

public class BikeRide {
    public Bicycle bicycle;

    //create a constructor that takes a Bicycle object
    public BikeRide(Bicycle bicycle) {
        this.bicycle = bicycle;

    }
//
//    public static void main(String[] args) {
////        Bicycle bicycle = new Bicycle();
////        BikeRide bikeRide = new BikeRide(bicycle);
////        bikeRide.ride();
////
////        //used function that tells me the bike's current speed
////        System.out.println("The current speed is " + bicycle.currentSpeed());
//    }


    public void ride() {
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.accelerate();
    }


}
