public class SimulationExpired {
    public SimulationExpired(ParkedCar[] parkedCars) {
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
            parkingTickets[i] = policeOfficer.patrol(new ParkedCar(parkedCars[i]), parkingMeters[i]); //Done
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
