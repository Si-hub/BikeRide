package bicycles.rides;

import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.Tandem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeRideTwoTest {

    //testing a all three models of my bikes on RoadBikeTwo ride

    @Test
    public void shouldTestARoadBikeUsingBikeRideTwo() {

        RoadBike roadBike = new RoadBike();
        BikeRideTwo bikeRideTwo = new BikeRideTwo(roadBike);
        bikeRideTwo.ride(roadBike);
        assertEquals(24, bikeRideTwo.currentSpeed());
    }

    @Test
    public void shouldTestAMountainBikeUsingBikeRideTwo() {

        MountainBike mountainBike = new MountainBike();
        BikeRideTwo bikeRideTwo = new BikeRideTwo(mountainBike);
        bikeRideTwo.ride(mountainBike);
        assertEquals(5, bikeRideTwo.currentSpeed());
    }

    @Test
    public void shouldTestATandemUsingBikeRideTwo() {

        Tandem tandem = new Tandem();
        BikeRideTwo bikeRideTwo = new BikeRideTwo(tandem);
        bikeRideTwo.ride(tandem);
        assertEquals(13, bikeRideTwo.currentSpeed());
    }
}
