
package bicycles;

import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.Tandem;

import java.util.ArrayList;

public class FunRide {
    private ArrayList<Bicycle> BikeList = new ArrayList<Bicycle>();
    private BicycleType bicycle;
    private int maxNoOfBikes;
    private  int mountainBikeCount;
    private int rodeBikeCount;
    private int tandemCount;

    //create constructor should specify the maximum number of bikes that can enter the FunRide
    public FunRide(int maxNoOfBikes) {
        this.maxNoOfBikes = maxNoOfBikes;
    }

    public void accept(Bicycle bicycle){
        if(BikeList.size() < maxNoOfBikes ){
            if(bicycle instanceof MountainBike){
               mountainBikeCount++;
            }else if(bicycle instanceof RoadBike){
                rodeBikeCount++;
            }else if(bicycle instanceof Tandem){
                tandemCount++;
            }
            BikeList.add(bicycle);
        }else{
            System.out.println("You have reached the maximum number of bikes");
        }


    }

    public int getCountForType(BicycleType bicycle){
       if(bicycle == BicycleType.MountainBike){
           return mountainBikeCount;
       }else{
           return 0;
       }

    }

    public int getEnteredCount(){
        return BikeList.size();
    }

    public static void main(String[] args) {
        FunRide fun = new FunRide(2);
//        fun.accept(new RoadBike());
        fun.accept(new MountainBike());
        fun.accept(new MountainBike());
        System.out.println(fun.getCountForType( BicycleType.MountainBike));
//        fun.accept(new Tandem());
//        System.out.println(fun.getEnteredCount());
    }

}
