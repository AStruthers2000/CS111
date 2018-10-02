import java.util.Random;

public class RobotHead {
    private String eyeColor;

    public RobotHead(){
        Random rand = new Random();
        String[] colors = {"blue", "green", "evil red", "creepy yellow", "black"};
        int colorNum = rand.nextInt(5);
        eyeColor = colors[colorNum];
    }

    public String toString(){
        String msg = "eye color: " + String.valueOf(eyeColor);
        return msg;
    }
}
