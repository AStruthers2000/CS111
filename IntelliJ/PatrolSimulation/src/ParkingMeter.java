public class ParkingMeter {
    private int minutesPurchased;

    public ParkingMeter(int numMinPurchased) {
        this.minutesPurchased = numMinPurchased;
    }

    public int getMinutesPurchased() {
        return minutesPurchased;
    }
    /*public void setMinutesPurchased(int minutesPurchased) {
        this.minutesPurchased = minutesPurchased;
    }*/

    public String toString() {
        return "Purchaced: " + getMinutesPurchased() + " minutes";
    }
}
