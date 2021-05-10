package bicycle;

import bicycle.models.RoadBike;
import bicycle.models.MountainBike;
import bicycle.models.Tandem;
import bicycle.rides.BikeRideOne;
import bicycle.rides.BikeRideThree;
import bicycle.rides.BikeRideTwo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


    public class BikeRideTests  {

        //testing a all three models of my bikes on RoadBikeOne ride
        @Test
        public void bikeRideOneWithRoadBikeModel() {

            RoadBike roadBike = new RoadBike();
            BikeRideOne bikeRideOne = new BikeRideOne(roadBike);
            bikeRideOne.ride(roadBike);
            assertEquals(36, bikeRideOne.currentSpeed());
        }

        @Test
        public void bikeRideOneWithMountainBikeModel() {

            MountainBike mountainBike = new MountainBike();
            BikeRideOne bikeRideOne = new BikeRideOne(mountainBike);
            bikeRideOne.ride(mountainBike);
            assertEquals(14, bikeRideOne.currentSpeed());
        }

        @Test
        public void bikeRideOneWithTandemModel() {

            Tandem tandem = new Tandem();
            BikeRideOne bikeRideOne = new BikeRideOne(tandem);
            bikeRideOne.ride(tandem);
            assertEquals(34, bikeRideOne.currentSpeed());
        }

        //testing a all three models of my bikes on RoadBikeTwo ride

        @Test
        public void bikeRideTwoWithRoadBikeModel() {

            RoadBike roadBike = new RoadBike();
            BikeRideTwo bikeRideTwo = new BikeRideTwo(roadBike);
            bikeRideTwo.ride(roadBike);
            assertEquals(24, bikeRideTwo.currentSpeed());
        }

        @Test
        public void bikeRideTwoWithMountainBikeModel() {

            MountainBike mountainBike = new MountainBike();
            BikeRideTwo bikeRideTwo = new BikeRideTwo(mountainBike);
            bikeRideTwo.ride(mountainBike);
            assertEquals(5, bikeRideTwo.currentSpeed());
        }

        @Test
        public void bikeRideTwoWithTandemModel() {

            Tandem tandem = new Tandem();
            BikeRideTwo bikeRideTwo = new BikeRideTwo(tandem);
            bikeRideTwo.ride(tandem);
            assertEquals(13, bikeRideTwo.currentSpeed());
        }

        //testing a all three models of my bikes on RoadBikeThree ride

        @Test
        public void bikeRideThreeWithRoadBikeModel() {

            RoadBike roadBike = new RoadBike();
            BikeRideThree bikeRideThree = new BikeRideThree(roadBike);
            bikeRideThree.ride(roadBike);
            assertEquals(69, bikeRideThree.currentSpeed());
        }

        @Test
        public void bikeRideThreeWithMountainBikeModel() {

            MountainBike mountainBike = new MountainBike();
            BikeRideThree bikeRideThree = new BikeRideThree(mountainBike);
            bikeRideThree.ride(mountainBike);
            assertEquals(29, bikeRideThree.currentSpeed());
        }

        @Test
        public void bikeRideThreeWithTandemModel() {

            Tandem tandem = new Tandem();
            BikeRideThree bikeRideThree = new BikeRideThree(tandem);
            bikeRideThree.ride(tandem);
            assertEquals(70, bikeRideThree.currentSpeed());
        }
}
