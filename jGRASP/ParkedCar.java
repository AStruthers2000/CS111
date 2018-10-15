public class ParkedCar {
    private String make, model, color, licenseNumber;
    private int minutesParked;

    //ParkedCar constructor with args from UML diagram
    public ParkedCar(String mk, String mdel, String col, String lic, int minParked) {
        this.make = mk;
        this.model = mdel;
        this.color = col;
        this.licenseNumber = lic;
        this.minutesParked = minParked;
    }

    //Copy constructor that takes values from car2
    public ParkedCar(ParkedCar car2) {
        make = car2.getMake();
        model = car2.getModel();
        color = car2.getColor();
        licenseNumber = car2.getLicenseNumber();
        minutesParked = car2.getMinutesParked();
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

    public String toString() { //toString formatted as outlined in pdf
        return "\tCar Data\n\tMake: " + getMake() + "\n\tModel: " + getModel() + "\n\tColor: " + getColor() + "\n\tLicense Number: " + getLicenseNumber() + "\n\tMinutes Parked: " + getMinutesParked() + "\n";
    }
}
