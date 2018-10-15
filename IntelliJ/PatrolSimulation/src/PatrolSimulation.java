public class PatrolSimulation {
    /**
     * I commented out almost every setter method and a few of the getter methods
     * I left them in as proof that I know how to do them, I just didn't see any
     * Use to the actual code.
     * <p>
     * I also didn't understand the point of the copy classes, what are those
     * Supposed to be used for?
     */

    public static void main(String[] args) {
        ParkedCar[] parkedCars = new ParkedCar[2];

        //Legally parked cars
        parkedCars[0] = new ParkedCar("Volkswagen", "1972", "Red", "V147RHZM", 12);
        parkedCars[1] = new ParkedCar("Mclaren", "2012 MP4-12C", "Volcano Red", "MCL-321", 45);

        System.out.println("Demonstrating legal parking...\n====================\n");
        new SimulationLegallyParked(parkedCars); //Running SimulationLegallyParked.java with legal cars

        //Illegally parked cars
        parkedCars[0] = new ParkedCar("Volkswagen", "1972", "Red", "V147RHZM", 121);
        parkedCars[1] = new ParkedCar("Mclaren", "2012 MP4-12C", "Volcano Red", "MCL-321", 450);

        System.out.println("\nDemonstrating expired parking...\n====================\n");
        new SimulationExpired(parkedCars); //Running SimulationExpired.java with illegal cars
    }
}
