public abstract class Ship {
    private String name;
    private int yearBuilt;
    private int numPropellers;

    public Ship(String name, int yearBuilt) {
        this.name = name;
        this.yearBuilt = yearBuilt;
    }

    @Override
    public abstract String toString();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public int getNumPropellers() {
        return numPropellers;
    }

    public void setNumPropellers(int numPropellers) {
        this.numPropellers = numPropellers;
    }
}
