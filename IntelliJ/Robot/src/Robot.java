import java.util.Random;

public class Robot {
    private static int numRobots = 0;
    private RobotHead robotHead;
    private RobotTorso robotTorso;
    private String serialID;

    public Robot(){
        numRobots++;
        Random rand = new Random();
        int lastName = rand.nextInt(100000);
        serialID = "Johnny" + String.valueOf(lastName);
        robotHead = new RobotHead();
        robotTorso = new RobotTorso();
    }

    public static int getRobotCount(){
        return numRobots;
    }

    public Robot copy(){
        Robot robotCopy = new Robot();
        robotCopy.setSerialID(serialID);
        return robotCopy;
    }

    public void setSerialID(String serial){
        serialID = serial;
    }

    public Boolean equals(Robot aRobot){
        if(serialID.equals(aRobot.getSerialID())){
            return true;
        }else{
            return false;
        }
    }

    public String getSerialID(){
        return serialID;
    }

    public String toString(){
        return "Serial ID: " + serialID + ", " + robotHead.toString() + ", " + robotTorso.toString();
    }
}
