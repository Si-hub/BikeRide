package bicycles.spec;

import bicycles.Bicycle;
import bicycles.BicycleType;
import bicycles.BikeRide;
import bicycles.rides.BikeRideOne;
import bicycles.rides.BikeRideThree;
import bicycles.rides.BikeRideTwo;
import bicycles.specification.BicycleFromSpec;
import bicycles.specification.BicycleSpecification;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class BicycleSpecTests {

    @Test
    public void shouldGetAccelerationSpeedAndBrakeForMountainBikeRide(){
        // MountainBike
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        Bicycle mountainBike = new BicycleFromSpec(mountainBikeSpec);

       // use one of your classes that implements BikeRide which is BikeRideOne
        BikeRide mBikeRide = new BikeRideOne (mountainBike);
        mBikeRide.ride(mountainBike);
        assertEquals(mountainBike.currentSpeed(),14);

    }

    @Test
    public void shouldGetAccelerationSpeedAndBrakeForRoadBikeRide(){
        // RoadBike
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        Bicycle roadBike = new BicycleFromSpec(roadBikeSpec);

        // use one of your classes that implements BikeRide which is BikeRideOne
        BikeRide rBikeRide = new BikeRideOne (roadBike);
        rBikeRide.ride(roadBike);
        assertEquals(roadBike.currentSpeed(),36);

    }

    @Test
    public void shouldGetAccelerationSpeedAndBrakeForTandemRide(){
        // Tandem
        BicycleSpecification tandemSpec = new BicycleSpecification(12, -7, BicycleType.Tandem);
        Bicycle tandem = new BicycleFromSpec(tandemSpec);

        // use one of your classes that implements BikeRide which is BikeRideOne
        BikeRide tandemRide = new BikeRideOne (tandem);
        tandemRide.ride(tandem);
        assertEquals(tandem.currentSpeed(),34);

    }

    @Test
    public void shouldGetAccelerationSpeedAndBrakeForRoadBike(){
        // RoadBike
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        Bicycle roadBike = new BicycleFromSpec(roadBikeSpec);

        // use one of your classes that implements BikeRide which is BikeRideTwo
        BikeRide rBikeRide = new BikeRideTwo(roadBike);
        rBikeRide.ride(roadBike);
        assertEquals(roadBike.currentSpeed(),24);

    }

    @Test
    public void shouldGetAccelerationSpeedAndBrakeForMountainBike(){
        // MountainBike
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        Bicycle mountainBike = new BicycleFromSpec(mountainBikeSpec);

        // use one of your classes that implements BikeRide which is BikeRideTwo
        BikeRide mBikeRide = new BikeRideTwo(mountainBike);
        mBikeRide.ride(mountainBike);
        assertEquals(mountainBike.currentSpeed(),5);

    }

    @Test
    public void shouldGetAccelerationSpeedAndBrakeForTandem(){
        // Tandem
        BicycleSpecification tandemSpec = new BicycleSpecification(12, -7, BicycleType.Tandem);
        Bicycle tandem = new BicycleFromSpec(tandemSpec);

        // use one of your classes that implements BikeRide which is BikeRideTwo
        BikeRide tandemRide = new BikeRideTwo(tandem);
        tandemRide.ride(tandem);
        assertEquals(tandem.currentSpeed(),13);

    }

    @Test
    public void shouldGetAccelerationAndBrakeForRoadBike(){
        // RoadBike
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        Bicycle roadBike = new BicycleFromSpec(roadBikeSpec);

        // use one of your classes that implements BikeRide which is BikeRideThree
        BikeRide rBikeRide = new BikeRideThree(roadBike);
        rBikeRide.ride(roadBike);
        assertEquals(roadBike.currentSpeed(),69);

    }

    @Test
    public void shouldGetAccelerationAndBrakeForMountainBike(){
        // MountainBike
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        Bicycle mountainBike = new BicycleFromSpec(mountainBikeSpec);

        // use one of your classes that implements BikeRide which is BikeRideThree
        BikeRide mBikeRide = new BikeRideThree(mountainBike);
        mBikeRide.ride(mountainBike);
        assertEquals(mountainBike.currentSpeed(),29);

    }

    @Test
    public void shouldGetAccelerationSpeedAndBrakeForTandemModel(){
        // Tandem
        BicycleSpecification tandemSpec = new BicycleSpecification(12, -7, BicycleType.Tandem);
        Bicycle tandem = new BicycleFromSpec(tandemSpec);

        // use one of your classes that implements BikeRide which is BikeRideTwo
        BikeRide tandemRide = new BikeRideThree(tandem);
        tandemRide.ride(tandem);
        assertEquals(tandem.currentSpeed(),70);

    }
}
