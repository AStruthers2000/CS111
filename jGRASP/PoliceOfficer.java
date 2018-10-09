public class PoliceOfficer {
    private String name;
    private String badgeNumber;

    public PoliceOfficer(String officerName, String badgeNumber) {
        this.name = officerName;
        this.badgeNumber = badgeNumber;
    }
    public PoliceOfficer(PoliceOfficer officer) {

    }

    public ParkingTicket patrol(ParkedCar car, ParkingMeter meter) {
        if (car.getMinutesParked() > meter.getMinutesPurchased()) {
            return new ParkingTicket(car, new PoliceOfficer(getName(), getBadgeNumber()), meter.getMinutesPurchased());
        } else {
            return null;
        }
    }

    public String getName() {
        return name;
    }
    /*public void setName(String name) {
        this.name = name;
    }*/

    public String getBadgeNumber() {
        return badgeNumber;
    }
    /*public void setBadgeNumber(String badgeNumber) {
        this.badgeNumber = badgeNumber;
    }*/

    public String toString() {
        return "\tOfficer Data:\n\tName: " + getName() + "\n\tBadgeNumber: " + getBadgeNumber() + "\n";
    }
}
