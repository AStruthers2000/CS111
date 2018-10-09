public class ParkingTicket {
    private ParkedCar car;
    private PoliceOfficer officer;
    private double fine;
    private int minutes;

    public final double BASE_FINE = 25.0;
    public final double HOURLY_FINE = 10.0;

    public ParkingTicket(ParkedCar aCar, PoliceOfficer anOfficer, int meterMins) {
        this.car = aCar;
        this.officer = anOfficer;
        this.minutes = this.car.getMinutesParked() - meterMins;
    }
    public ParkingTicket(ParkingTicket ticket) {

    }

    public void calculateFine() {
        if (getMinutes() > 0) {
            fine = BASE_FINE + (getMinutes() / 60) * HOURLY_FINE;
        } else {
            fine = 0.0;
        }
    }

    /*public ParkedCar getCar() {
        return car;
    }*/
    /*public void setCar(ParkedCar car) {
        this.car = car;
    }*/

    public PoliceOfficer getOfficer() {
        return officer;
    }
    /*public void setOfficer(PoliceOfficer officer) {
        this.officer = officer;
    }*/

    public double getFine() {
        calculateFine();
        return fine;
    }
    /*public void setFine(double fine) {
        this.fine = fine;
    }*/

    public int getMinutes() {
        return minutes;
    }
    /*public void setMinutes(int minutes) {
        this.minutes = minutes;
    }*/

    public String toString() {
        return car.toString() + "\n" + officer.toString() + "\n\tTicket Data\n\tMinutes Illegally Parked: " + getMinutes() + "\n\tFine: " + getFine() + "\n";
    }
}
