public class CargoShip extends Ship{
    private int tonnage;
    private boolean isDoubleHull;

    public CargoShip(String name, int year, int tonnage, boolean isDoubleHull, int numPropellers) {
        super(name, year);
        super.setNumPropellers(numPropellers);
        this.tonnage = tonnage;
        this.isDoubleHull = isDoubleHull;
    }

    public int getTonnage() {
        return tonnage;
    }

    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }

    public boolean isDoubleHull() {
        return isDoubleHull;
    }

    public void setDoubleHull(boolean doubleHull) {
        isDoubleHull = doubleHull;
    }

    @Override
    public String toString() {
        return "Name: " + super.getName() + "\n" +
                "Type: Cargo Ship\n" +
                "Cargo capacity: " + getTonnage() + " tons\n" +
                "Year built: " + super.getYearBuilt() + "\n" +
                "Double hull: " + isDoubleHull();
    }
}
