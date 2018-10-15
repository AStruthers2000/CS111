public class ParkingMeter {
    private int minutesPurchased;

    //ParkingMeter constructor outlined in UML diagram
    public ParkingMeter(int numMinPurchased) {
        this.minutesPurchased = numMinPurchased;
    }

    public int getMinutesPurchased() {
        return minutesPurchased;
    }
    /*public void setMinutesPurchased(int minutesPurchased) {
        this.minutesPurchased = minutesPurchased;
    }*/

    public String toString() { //toString method
        return "Purchaced: " + getMinutesPurchased() + " minutes";
    }
}
