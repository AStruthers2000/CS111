public class CruiseShip extends Ship{
    private int passengers;
    private int numPets;

    public CruiseShip(String name, int year, int passengers, int numPets) {
        super(name, year);
        this.passengers = passengers;
        this.numPets = numPets;
    }

    @Override
    public String toString() {
        return "CruiseShip{" +
                "passengers=" + passengers +
                ", numPets=" + numPets +
                '}';
    }
}
