public class GameV3 {
    String getClassName(){
        return this.getClass().getSimpleName();
    }

    public static void main(String args[]) {

        // designate how many rooms are in the game
        final int NUM_ROOMS = 11;

        // declare array of rooms
        Room[] gameBoard = new Room[NUM_ROOMS];

        // populate the room array, using the superclass Room
        gameBoard[0] = new Room("First Room", "1 apple;pumpkin", 0, "e1;w2;n5");
        gameBoard[1] = new Room("Blue Room", "3 grapes;barking German Shephard", 1, "w0;e2;n3;s7");
        gameBoard[2] = new Room("Green Room", "meowing kitten;", 2, "w1;e0;n4;s8");

        // adding my rooms to gameBoard for Step 1
        gameBoard[3] = new Room("Kitchen", "steak;knife;bowl;water bottle", 3, "s1;e4;w5");
        gameBoard[4] = new Room("Dining Room", "chair;table cloth;candlestick", 4, "w3;s2;e5");
        gameBoard[5] = new Room("Storage Room", "flower;potatoes;canned food", 5, "w4;e3;s0;n6");

        // adding MonsterRooms to gameBoard for Step 2
        gameBoard[6] = new MonsterRoom("Haunted Closet", "sheet;axe;bloody knife", 6, "s5");
        gameBoard[7] = new MonsterRoom("Haunted Alley", "cobweb;torch;goblet", 7, "n1;e8;s10");
        gameBoard[8] = new MonsterRoom("Haunted Room", "scull;bones;helmet;coin purse", 8, "n2;s9;w7");
        gameBoard[9] = new MonsterRoom("Asylum", "straitjacket;handcuffs;surgery tools", 9, "n8;w10");
        gameBoard[10] = new MonsterRoom("Haunted Vault", "evil looking coin purse;arrow;burnt money",10, "n7;e9");

        //-n-
        //w+e
        //-s-
        //                 haunted closet 6
        //                      |
        //  dining room 4 -- storage 5  -- kitchen 3 -- dining room 4 -- etc......
        //      |               |              |              |
        // green room  2 -- first room 0 -- blue room 1 -- green room 2 -- etc....
        //      |                               |              |
        // haunted room 8               haunted alley 7 -- haunted room 8 -- etc..
        //      |                               |               |
        //   asylum 9                   haunted vault 10 -- asylum 9 -- etc.......

        // keep track of which room player is in
        int playerRoomNumber = 0;

        // create player object, using the superclass Player
        // player is now type CustomPlayer, with an extra argument for my added functionality as per step 3
        Player player = new CustomPlayer("Andrew", playerRoomNumber, "phone;laptop;4 dollars", 7);

        GameV3 game = new GameV3();
        System.out.println("You are currently playing: " + game.getClassName());
        System.out.println("\tIn this version, there are more than six rooms, with more than one as a MonsterRoom, with special behavior, instead of a regular Room. There is also a new CustomPlayer instead of the default Player, with two different fields and behaviors.");
        System.out.println("==========\n");
        // play the game, as long as player object has field continuePlay set to true
        while (player.getContinuePlay() == true) {
            playerRoomNumber = gameBoard[playerRoomNumber].playRoom(player);
        }
    }
}
