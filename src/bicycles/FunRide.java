
package bicycles;

import java.util.ArrayList;

public class FunRide {
    // an array list of bicycle type
    private ArrayList<Bicycle> BikeList = new ArrayList<Bicycle>();
    private int maxNoOfBikes;


    //create constructor should specify the maximum number of bikes that can enter the FunRide
    public FunRide(int maxNoOfBikes) {
        this.maxNoOfBikes = maxNoOfBikes;
    }

    public String accept(Bicycle bicycle){
        String accepted = "accepted";
        String rejected = "rejected";

        if(BikeList.size() < maxNoOfBikes ){
            BikeList.add(bicycle);
            return accepted;
        }else{
            return rejected;
        }
    }

    public int getCountForType(BicycleType bicycle){
       int bikeCount = 0;

        // iterating through an arraylist of bikeType using the for-each loop
        for(Bicycle item : BikeList) {
            if(item.getBicycleType().equals(bicycle)){
                bikeCount++;
            }

        }

       return bikeCount;
    }

    public int getEnteredCount(){
        return BikeList.size();
    }


}
