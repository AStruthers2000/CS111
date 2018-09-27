import java.util.Random;

public class RobotTorso {
    private int numArms;

    public RobotTorso(){
        Random rand = new Random();
        numArms = rand.nextInt(10);

    }

    public String toString(){
        String msg = "number of arms: " + String.valueOf(numArms);
        return msg;
    }
}
