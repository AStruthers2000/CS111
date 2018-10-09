public class ParkedCar {
    private String make, model, color, licenseNumber;
    private int minutesParked;

    public ParkedCar(String mk, String mdel, String col, String lic, int minParked) {
        this.make = mk;
        this.model = mdel;
        this.color = col;
        this.licenseNumber = lic;
        this.minutesParked = minParked;
    }
    public ParkedCar(ParkedCar car2) {

    }

    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }
    /*public void setModel(String model) {
        this.model = model;
    }*/

    public String getColor() {
        return color;
    }
    /*public void setColor(String color) {
        this.color = color;
    }*/

    public String getLicenseNumber() {
        return licenseNumber;
    }
    /*public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }*/

    public int getMinutesParked() {
        return minutesParked;
    }
    /*public void setMinutesParked(int minutesParked) {
        this.minutesParked = minutesParked;
    }*/

    public String toString() {
        return "\tCar Data\n\tMake: " + getMake() + "\n\tModel: " + getModel() + "\n\tColor: " + getColor() + "\n\tLicense Number: " + getLicenseNumber() + "\n\tMinutes Parked: " + getMinutesParked() + "\n";
    }
}
