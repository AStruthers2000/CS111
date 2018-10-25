public class CargoShip extends Ship{
    private int tonnage;
    private boolean isDoubleHull;

    public CargoShip(String name, int year, int tonnage, boolean isDoubleHull) {
        super(name, year);
        this.tonnage = tonnage;
        this.isDoubleHull = isDoubleHull;
    }

    @Override
    public String toString() {
        return "CargoShip{" +
                "tonnage=" + tonnage +
                ", isDoubleHull=" + isDoubleHull +
                '}';
    }
}
