public class RobotGarage {
    public static void main(String[] args){
        Robot[] robots = new Robot[3];

        robots[0] = new Robot();
        robots[1] = new Robot();
        robots[2] = robots[0].copy();

        System.out.println("Robot 1: " + robots[0].toString());
        System.out.println("Robot 2: " + robots[1].toString());
        System.out.println("Robot 3: " + robots[2].toString());

        System.out.println("Number of total robots: " +Robot.getRobotCount());

        boolean theSame = false;
        for(int a = 0; a<robots.length; a++){
            Robot curBot = robots[a];
            for(int b = 0; b<robots.length; b++){
                if(!(b==a) && !theSame){
                    if(curBot.equals(robots[b])){
                       System.out.println("Robots " + a + " and " + b + " have the same ID");
                       theSame = true;
                    }
                }
            }
        }
    }
}
