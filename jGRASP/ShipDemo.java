public class ShipDemo {

    public static void main(String[] args){
        final int NUM_SHIPS = 7;
        Ship[] ships = new Ship[NUM_SHIPS];

        ships[0] = new CruiseShip("RMS Titanic", 1912, 1317, 413, 4);
        ships[1] = new CargoShip("SS Bellatrix", 2015, 1620, false, 8);
        ships[2] = new CargoShip("SS Antares", 1972, 55355, false, 6);
        ships[3] = new CruiseShip("MS Allure of the Seas", 2008, 6296, 1252, 10);
        ships[4] = new CargoShip("MSC Oscar", 2015, 197362, false, 12);
        ships[5] = new CruiseShip("MS Liberty of the Seas", 2007, 4960, 1572, 4);
        ships[6] = new CargoShip("CMA CGM Kerguelen", 2015, 175688, false, 8);

        for(Ship ship : ships){
            System.out.println(ship.toString());
            System.out.println("----------------------------");
        }
    }

}
