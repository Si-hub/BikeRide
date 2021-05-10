package bicycle.rides;

import bicycle.Bicycle;
import bicycle.BikeRide;


public class BikeRideOne implements BikeRide {


        public Bicycle bicycle;

        //create a constructor that takes a Bicycle object
        public BikeRideOne(Bicycle bicycle) {
            this.bicycle = bicycle;

        }

        public void ride(Bicycle bicycle) {
            this.bicycle.accelerate();
            this.bicycle.accelerate();
            this.bicycle.accelerate();
            this.bicycle.brake();
            this.bicycle.brake();
            this.bicycle.accelerate();
        }

        public int currentSpeed(){
            return this.bicycle.currentSpeed();
        }
}
