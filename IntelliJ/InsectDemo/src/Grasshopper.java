/**
 * @author Andrew Struthers
 * @version 1.123
 * @since 25 October 2018
 */
public class Grasshopper extends Insect {

    // fields
    private double jumpDistance;

    //methods

    /**
     * Constructor
     *
     * Takes no arguments
     */
    public Grasshopper() {
    }

    /**
     * This setter method sets the value of jumpDistance instance field
     *
     * @param dist the jump distance of the Grasshopper
     */
    public void setJumpDist(double dist) {
        jumpDistance = dist;
    }

    /**
     * This getter returns the value of jumpDistance
     *
     * @return the distance of the Grasshopper jump length
     */
    public double getJumpDist() {
        return jumpDistance;
    }
}