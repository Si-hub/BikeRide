package bicycles;

public class Bicycle {

    private int speed;

    public void accelerate() {
        speed = 5;
    }

    public void brake(){
        speed = 3;
    }

    public void stop(){
        speed = 0;
    }

    public int currentSpeed(){
        return speed;
    }

    public static void main(String[] args) {
	// write your code here

    }
}
