import java.util.Scanner;

public class MonsterRoom extends Room {
    public MonsterRoom(String roomName, String objects, int roomNum, String listOfExits) {
        super(roomName, objects, roomNum, listOfExits);
    }

    @Override
    public int playRoom(Player player) {
        return super.playRoom(player);
    }

    // transfer item from room to user's inventory
    protected void userPicksUp(Player player) {
        System.out.println("What would you like to pick up?");
        Scanner keyboard = new Scanner(System.in);
        String itemToPickUp = keyboard.nextLine();
        if (Utilities.isItemInContainer(itemToPickUp, super.getRoomObjects())) {
            System.out.println("What do you mean you tried to pick up " + itemToPickUp + "!\nDon't you know that item is evidence!?\n\t>>>You got removed from the haunted house for tampering with live evidence");
            player.setContinuePlay(false);
            System.out.println("\t>>>Game over!");
        } else {
            System.out.println("That item is not in the room");
        }
    }

    // transfer item from user's inventory to room
    protected void userDrops(Player player) {
        System.out.println("What would you like to drop?");
        Scanner keyboard = new Scanner(System.in);
        String itemToDrop = keyboard.nextLine();
        if (Utilities.isItemInContainer(itemToDrop, player.getInventory())) {
            System.out.println("You have sacrificed " + itemToDrop + " to the evil spirits...\nThey are appeased... for now...");
            player.removeFromInventory(itemToDrop);
            super.addToObjects(itemToDrop);
        } else {
            System.out.println("You cannot drop something that you don't have");
        }
    }
}
