// sample game demo file

public class GameDemoSimple {
    String getClassName(){
        return this.getClass().getSimpleName();
    }

    public static void main(String args[]) {

        // designate how many rooms are in the game
        final int NUM_ROOMS = 6;

        // declare array of rooms
        Room[] gameBoard = new Room[NUM_ROOMS];

        // populate the room array, using the superclass Room
        gameBoard[0] = new Room("First Room", "1 apple;pumpkin", 0, "e1;w2;n5");
        gameBoard[1] = new Room("Blue Room", "3 grapes;barking Germany Shephard", 1, "w0;e2;n3");
        gameBoard[2] = new Room("Green Room", "meowing kitten;", 2, "w1;e0;n4");

        // adding my rooms to gameBoard for Step 1
        gameBoard[3] = new Room("Kitchen", "steak;knife;bowl;water bottle", 3, "s1;e4;w5");
        gameBoard[4] = new Room("Dining Room", "chair;table cloth;candlestick", 4, "w3;s2;e5");
        gameBoard[5] = new Room("Storage Room", "flower;potatoes;canned food", 5, "w4;e3;s0");

                //-n-
                //w+e
                //-s-
                //  dining room 4 -- storage 5  -- kitchen 3 -- dining room 4 -- etc.....
                //      |               |              |              |
                // green room  2 -- first room 0 -- blue room 1 -- green room 2 -- etc.....

        // keep track of which room player is in 
        int playerRoomNumber = 0;

        // create player object, using the superclass Player
        Player player = new Player("Tatiana", playerRoomNumber, "bubble gum;band-aid;toothpick");

        GameV3 game = new GameV3();
        System.out.println("You are currently playing: " + game.getClassName());
        System.out.println("\tIn this version, there are more than the 3 rooms in v.1.0");
        System.out.println("==========\n");
        // play the game, as long as player object has field continuePlay set to true
        while (player.getContinuePlay() == true) {
            playerRoomNumber =
                    gameBoard[playerRoomNumber].playRoom(player);
        }
    }
}