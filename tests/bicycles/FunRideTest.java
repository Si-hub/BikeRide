package bicycles;

import bicycles.specification.BicycleFromSpec;
import bicycles.specification.BicycleSpecification;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class FunRideTest {

    @Test
    public void shouldAcceptMountainBike(){
        // MountainBike
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        Bicycle mountainBike = new BicycleFromSpec(mountainBikeSpec);
        FunRide funRide = new FunRide(3);
        assertEquals(funRide.accept(mountainBike), "accepted");

    }


    @Test
    public void shouldRejectRoadBikeOnly(){

        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        Bicycle mountainBike = new BicycleFromSpec(mountainBikeSpec);
        FunRide funRide = new FunRide(2); //declaring maximum number of my bicycle
        assertEquals(funRide.accept(mountainBike), "accepted");

        BicycleSpecification tandemBikeSpec = new BicycleSpecification(12, -7, BicycleType.Tandem);
        Bicycle tandemBike = new BicycleFromSpec(tandemBikeSpec);
        assertEquals(funRide.accept(tandemBike), "accepted");

        BicycleSpecification rBikeSpec = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        Bicycle roadBike = new BicycleFromSpec(rBikeSpec);
        assertEquals(funRide.accept(roadBike), "rejected");

    }


    @Test
    public void shouldReturnTheNoOfBikesAcceptedOnFunRide(){

        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        Bicycle mountainBike = new BicycleFromSpec(mountainBikeSpec);
        FunRide funRide = new FunRide(3); //declaring maximum number of my bicycle

        BicycleSpecification tandemBikeSpec = new BicycleSpecification(12, -7, BicycleType.Tandem);
        Bicycle tandemBike = new BicycleFromSpec(tandemBikeSpec);

        BicycleSpecification rBikeSpec = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        Bicycle roadBike = new BicycleFromSpec(rBikeSpec);

        funRide.accept(mountainBike);
        funRide.accept(tandemBike);
        funRide.accept(roadBike);

        assertEquals(funRide.getEnteredCount(), 3);

    }


    @Test
    public void shouldReturnMaxNoOfBikesAccepted(){

        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        Bicycle mountainBike = new BicycleFromSpec(mountainBikeSpec);
        FunRide funRide = new FunRide(10); //declaring maximum number of my bicycle

        BicycleSpecification tandemBikeSpec = new BicycleSpecification(12, -7, BicycleType.Tandem);
        Bicycle tandemBike = new BicycleFromSpec(tandemBikeSpec);

        BicycleSpecification rBikeSpec = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        Bicycle roadBike = new BicycleFromSpec(rBikeSpec);
        Bicycle roadBike2 = new BicycleFromSpec(rBikeSpec);

        funRide.accept(mountainBike);
        funRide.accept(tandemBike);
        funRide.accept(roadBike);
        funRide.accept(roadBike2);

        assertEquals(funRide.getEnteredCount(), 4);

    }

    @Test
    public void shouldReturnNoOfBikesWithAGivenType(){

        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        Bicycle mountainBike = new BicycleFromSpec(mountainBikeSpec);
        Bicycle mountainBike2 = new BicycleFromSpec(mountainBikeSpec);

        FunRide funRide = new FunRide(10); //declaring maximum number of my bicycle

        BicycleSpecification tandemBikeSpec = new BicycleSpecification(12, -7, BicycleType.Tandem);
        Bicycle tandemBike = new BicycleFromSpec(tandemBikeSpec);
        Bicycle tandemBike2 = new BicycleFromSpec(tandemBikeSpec);
        Bicycle tandemBike3 = new BicycleFromSpec(tandemBikeSpec);

        BicycleSpecification rBikeSpec = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        Bicycle roadBike = new BicycleFromSpec(rBikeSpec);
        Bicycle roadBike2 = new BicycleFromSpec(rBikeSpec);


        funRide.accept(mountainBike);
        funRide.accept(mountainBike2);

        funRide.accept(tandemBike);
        funRide.accept(tandemBike2);
        funRide.accept(tandemBike3);

        funRide.accept(roadBike);
        funRide.accept(roadBike2);


        assertEquals(funRide.getCountForType(BicycleType.MountainBike), 2);
        assertEquals(funRide.getCountForType(BicycleType.Tandem), 3);
        assertEquals(funRide.getCountForType(BicycleType.RoadBike), 2);

    }
}
