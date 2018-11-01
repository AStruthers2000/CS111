public class GameV4 {
    private String getClassName(){
        return this.getClass().getSimpleName();
    }

    public static void main(String args[]) {

        // designate how many rooms are in the game
        final int NUM_ROOMS = 16;

        // declare array of rooms
        Room[] gameBoard = new Room[NUM_ROOMS];

        // populate the room array, using the superclass Room
        gameBoard[0] = new Room("First Room", "apple;pumpkin", 0, "e1;w2;n5;s11");
        gameBoard[1] = new Room("Blue Room", "grapes;backpack", 1, "w0;e2;n3;s7");
        gameBoard[2] = new Room("Green Room", "book;", 2, "w1;e0;n4;s8");

        // adding my rooms to gameBoard for Step 1
        gameBoard[3] = new Room("Kitchen", "steak;sack;bowl;water bottle", 3, "s1;e4;w5");
        gameBoard[4] = new Room("Dining Room", "chair;table cloth;candlestick", 4, "w3;s2;e5");
        gameBoard[5] = new Room("Storage Room", "backpack;potatoes;canned food", 5, "w4;e3;s0;n6");

        // adding MonsterRooms to gameBoard for Step 2
        gameBoard[6] = new MonsterRoom("Haunted Closet", "sheet;axe;bloody knife", 6, "s5");
        gameBoard[7] = new MonsterRoom("Haunted Alley", "cobweb;torch;goblet", 7, "n1;e8;s10");
        gameBoard[8] = new MonsterRoom("Haunted Room", "scull;bones;helmet;coin purse", 8, "n2;s9;w7");
        gameBoard[9] = new MonsterRoom("Asylum", "straitjacket;handcuffs;surgery tools", 9, "n8;w10;s14");
        gameBoard[10] = new MonsterRoom("Haunted Vault", "evil looking coin purse;arrow;burnt money",10, "n7;e9");

        gameBoard[11] = new Room("Hallway", "bag", 11, "n0;s12");
        gameBoard[12] = new Room("Hallway 2", "", 12, "n11;s13");
        gameBoard[13] = new WorshipRoom("Prayer Room", "candle;book;holy water", 13, "n12");

        gameBoard[14] = new Room("Entryway", "telescope;sack;paper;clock", 14, "n9;w15");
        gameBoard[15] = new MapRoom("Map Room", "map;backpack;lamp;pencil", 15, "e14");

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

        // keep track of which room player is in
        int playerRoomNumber = 0;

        // create player object, using the superclass Player
        // player is now type CustomPlayer, with an extra argument for my added functionality as per step 3
        CustomPlayer player = new CustomPlayer("Andrew", playerRoomNumber, "phone;laptop;4 dollars", 4);

        GameV4 game = new GameV4();
        System.out.println("You are currently playing: " + game.getClassName());
        System.out.println("In this version, you play as a CustomPlayer in a house with 9 Rooms, 5 MonsterRooms, 1 WorshipRoom, and 1 MapRoom.\n" +
                           "The player has two different values, Spirit Approval rating and Carrying Capacity." +
                           "\n\tSpirit Approval can be improved by praying, and Carrying Capacity can be improved by picking up anything used to carry other things.\n" +
                           "There is a viewable map, but you need to find where to access it.\n" +
                           "Beware of any haunted rooms....");
        System.out.println("==========\n");

        // play the game, as long as player object has field continuePlay set to true
        while (player.getContinuePlay() == true) {
            playerRoomNumber = gameBoard[playerRoomNumber].playRoom(player);
        }
    }
}
