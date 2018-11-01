import java.util.Scanner;

public class MapRoom extends Room {
    public MapRoom(String roomName, String objects, int roomNum, String listOfExits) {
        super(roomName, objects, roomNum, listOfExits);
    }

    @Override
    public int playRoom(CustomPlayer player) {
        return getNextRoom(player);
    }

    private int getNextRoom(CustomPlayer player){
        // inform the player of his/her current room
        System.out.println("You are in the " + super.getRoomName());
        System.out.println("What would you like to do?");

        // variables for player interaction
        String command;
        int newRoomNum = super.getRoomNum();
        Scanner keyboard = new Scanner(System.in);
        command = keyboard.nextLine();

        // switch on the user's command
        switch (command) {
            case "exits":
                printListOfExits();
                break;
            case "look":
                printObjectsInRoom();
                break;
            case "view map":
                viewMap();
                break;
            case "inventory":
                player.printInventory();
                break;
            case "go west":
            case "go east":
            case "go south":
            case "go north":
                newRoomNum = leaveRoom(command);
                break;
            case "quit":
                player.setContinuePlay(false);
                break;
            case "pick up":
                userPicksUp(player);
                break;
            case "drop":
                userDrops(player);
                break;
            case "help":
                Utilities.printHelp();
                break;
            default:
                System.out.println("Invalid command. Type help for details.");
        }
        return newRoomNum;
    }

    //-n-
    //w+e
    //-s-
    //                 haunted closet 6
    //                      |
    //  dining room 4 -- storage 5  -- kitchen 3 -- dining room 4 -- etc......
    //      |               |              |              |
    // green room  2 -- first room 0 -- blue room 1 -- green room 2 -- etc....
    //      |               |               |              |
    // haunted room 8   hallway 11  haunted alley 7 -- haunted room 8 -- etc..
    //      |               |               |               |
    //   asylum 9      hallway 2 12  haunted vault 10 -- asylum 9 -- etc.......
    //      |                |                            |
    //   entryway 14   prayer room 13      map room 15 -- entryway 14

    protected void viewMap(){
        String map = "                               _\n";
        map+=        "                             / n \\\n";
        map+=        "                            | w+e |\n";
        map+=        "                             \\ s /\n";
        map+=        "                               ‾‾\n\n";
        map+=        "                  Haunted Closet\n";
        map+=        "                        |\n";
        map+=        "---- Dining Room --- Storage ----- Kitchen --- Dining Room ----\n";
        map+=        "         |              |             |              |\n";
        map+=        "--- Green Room --- First Room ---- Blue Room --- Green Room ---\n";
        map+=        "         |              |             |              |\n";
        map+=        "-- Haunted Room     Hallway    Haunted Alley -- Haunted Room --\n";
        map+=        "         |              |             |              |\n";
        map+=        "----- Asylum        Hallway 2     Haunted Fault -- Asylum -----\n";
        map+=        "         |              |                            |\n";
        map+=        "---- Entryway       Prayer Room      Map Room -- Entry way ----\n";
        System.out.println(map);
    }
}
