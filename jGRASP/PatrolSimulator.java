public class PatrolSimulator {
    /**
     * I commented out almost every setter method and a few of the getter methods
     * I left them in as proof that I know how to do them, I just didn't see any
     * Use to the actual code.
     *
     * I also didn't understand the point of the copy classes, what are those
     * Supposed to be used for?
     */

    public static void main(String[] args) {
        // Create an array of 2 Car objects, with various minutesParked
        // values
        ParkedCar[] parkedCars = new ParkedCar[2];
        parkedCars[0] = new ParkedCar("Volkswagen", "1972", "Red", "V147RHZM", 121);
        parkedCars[1] = new ParkedCar("Mclaren", "2012 MP4-12C", "Volcano Red", "MCL-321", 45);
        //Done

        // Create an array of 2 ParkingMeter objects, with minutes so that
        // the first Car object is in violation, while the second is not
        ParkingMeter[] parkingMeters = {new ParkingMeter(60), new ParkingMeter(120)}; //Done

        // Create an array of 2 ParkingTicket objects
        ParkingTicket[] parkingTickets = new ParkingTicket[2]; //Done

        // Create a PoliceOfficer object. Give the officer a name and badge
        // number
        PoliceOfficer policeOfficer = new PoliceOfficer("Duke Ellington", "2012412"); //Should be done

        // Have the officer patrol each of the Car and ParkingMeter object
        // combinations (index i for the array of Car objects should be
        // matched with index i for the array of ParkingMeter objects, which
        // should be matched with index i of the array of ParkingTicket
        // objects)
        for (int i = 0; i < parkedCars.length; i++) {
            parkingTickets[i] = policeOfficer.patrol(parkedCars[i], parkingMeters[i]); //Done
        }

        // After the PoliceOfficer has patrolled the cars and parking
        // meters, walk over the array of ParkingTickets and invoke the
        // toString method if a ticket has been issued, otherwise indicate
        // that a ticket has not been issued
        for (int j = 0; j < parkingTickets.length; j++) {
            System.out.println("Car/Parking meter " + (j + 1) + ": ");
            try {
                System.out.println(parkingTickets[j].toString()); //Done
            } catch (NullPointerException e) {
                System.out.println("\tNo violation\n");
            }
        }
    }
}
