package bicycles.rides;

import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.Tandem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeRideOneTest {

    //testing all three models of my bikes on RoadBikeOne ride
    @Test
    public void shouldTestARoadBikeUsingBikeRideOne() {

        RoadBike roadBike = new RoadBike();
        BikeRideOne bikeRideOne = new BikeRideOne(roadBike);
        bikeRideOne.ride(roadBike);
        assertEquals(36, bikeRideOne.currentSpeed());
    }

    @Test
    public void shouldTestAMountainBikeUsingBikeRideOne() {

        MountainBike mountainBike = new MountainBike();
        BikeRideOne bikeRideOne = new BikeRideOne(mountainBike);
        bikeRideOne.ride(mountainBike);
        assertEquals(14, bikeRideOne.currentSpeed());
    }

    @Test
    public void shouldTesATandemUsingBikeRideOne() {

        Tandem tandem = new Tandem();
        BikeRideOne bikeRideOne = new BikeRideOne(tandem);
        bikeRideOne.ride(tandem);
        assertEquals(34, bikeRideOne.currentSpeed());
    }
}
