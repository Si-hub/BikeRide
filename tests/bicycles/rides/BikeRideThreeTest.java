package bicycles.rides;

import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.Tandem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeRideThreeTest {

    //testing a all three models of my bikes on RoadBikeThree ride

    @Test
    public void shouldTestARoadBikeRide() {

        RoadBike roadBike = new RoadBike();
        BikeRideThree bikeRideThree = new BikeRideThree(roadBike);
        bikeRideThree.ride(roadBike);
        assertEquals(69, bikeRideThree.currentSpeed());
    }

    @Test
    public void shouldTestAMountainBikeRide() {

        MountainBike mountainBike = new MountainBike();
        BikeRideThree bikeRideThree = new BikeRideThree(mountainBike);
        bikeRideThree.ride(mountainBike);
        assertEquals(29, bikeRideThree.currentSpeed());
    }

    @Test
    public void shouldTestATandemRide() {

        Tandem tandem = new Tandem();
        BikeRideThree bikeRideThree = new BikeRideThree(tandem);
        bikeRideThree.ride(tandem);
        assertEquals(70, bikeRideThree.currentSpeed());
    }
}
