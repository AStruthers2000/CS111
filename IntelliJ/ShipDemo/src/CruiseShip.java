public class CruiseShip extends Ship{
    private int passengers;
    private int numPets;

    public CruiseShip(String name, int year, int passengers, int numPets, int numPropellers) {
        super(name, year);
        super.setNumPropellers(numPropellers);
        this.passengers = passengers;
        this.numPets = numPets;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getNumPets() {
        return numPets;
    }

    public void setNumPets(int numPets) {
        this.numPets = numPets;
    }

    @Override
    public String toString() {
        return "Name: " + super.getName() + "\n" +
                "Type: Cruise Ship\n" +
                "Maximum passengers: " + getPassengers() + " tons\n" +
                "Year built: " + super.getYearBuilt() + "\n" +
                "Num Pets Allowed: " + getNumPets();
    }
}
