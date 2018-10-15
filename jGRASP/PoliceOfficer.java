public class PoliceOfficer {
    private String name;
    private String badgeNumber;

    //Constructor with args from UML diagram
    public PoliceOfficer(String officerName, String badgeNumber) {
        this.name = officerName;
        this.badgeNumber = badgeNumber;
    }

    //Copy constructor that copies values of officer
    public PoliceOfficer(PoliceOfficer officer) {
        name = officer.getName();
        badgeNumber = officer.getBadgeNumber();
    }

    public ParkingTicket patrol(ParkedCar car, ParkingMeter meter) {
        if (car.getMinutesParked() > meter.getMinutesPurchased()) { //checks to see if there is a fine
            //using copy constructor to make new ParkedCar with arg car, new PoliceOfficer with arg this, and the number of minutes purchased from meter
            return new ParkingTicket(new ParkedCar(car), new PoliceOfficer(this), meter.getMinutesPurchased());
        } else { //if no fine, returns null
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

    public String toString() { //toString formatted with output outlined in pdf
        return "\tOfficer Data:\n\tName: " + getName() + "\n\tBadgeNumber: " + getBadgeNumber() + "\n";
    }
}
