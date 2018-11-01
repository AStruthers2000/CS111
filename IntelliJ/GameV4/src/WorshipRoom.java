import java.util.Scanner;

public class WorshipRoom extends Room {
    public WorshipRoom(String roomName, String objects, int roomNum, String listOfExits) {
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
            case "worship":
                worship(player);
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

    protected void worship(CustomPlayer player){
        System.out.println("So you've come to worship huh?");
        System.out.println("Good idea!");
        System.out.println("The spirits approve of you " + player.getSpiritApproval() + "%");
        if(player.getSpiritApproval() <= 65.0) {
            player.addToSpiritApproval(35.0);
        }else{
            player.addToSpiritApproval(100.0 - player.getSpiritApproval());
        }
        System.out.println("After your prayers and sacrifices, the spirits approve of you " + player.getSpiritApproval() + "%");
    }
}
