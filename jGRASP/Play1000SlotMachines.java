import java.util.Random; //Imports random class for generating slots

public class Play1000SlotMachines { //Main class, public for accessibility

    public static SlotMachine[] genMachines(){
        SlotMachine[] machines = new SlotMachine[1000]; //Inits array of 1000 SlotMachine objects
        for(int a = 0; a<1000; a++){
            machines[a] = new SlotMachine(); //puts new SlotMachine object in slot array
        }
        return machines;
    }

    public static void main(String[] args){
        int winCount = 0;

        SlotMachine[] slots = genMachines();
        for(SlotMachine machine : slots){ //Iterates through all 1000 SlotMachine objects returned from genMachines()
            machine.playMachine(); //Generates three "rows" of random numbers
            if(machine.isWinner()){ //Checks to see if arrays in class match
                winCount += 1; //If match, adds one to winCount
            }
        }

        System.out.println("From 1000 slot machines, " + winCount + " were winners");
    }
}

class SlotMachine {
    //inits three arrays with three spots each
    private int[] row1 = new int[3];
    private int[] row2 = new int[3];
    private int[] row3 = new int[3];

    public void playMachine(){ //"Spins" the slot machine
        Random rand = new Random(); //Creates new random seed

        for(int a = 0; a<3; a++){
            //Generates a random number, 1-9, and adds them to spot 'a' in row 1, 2, and 3
            row1[a] = rand.nextInt(9)+1;
            row2[a] = rand.nextInt(9)+1;
            row3[a] = rand.nextInt(9)+1;
        }
    }

    //Super condenced winning checker
    public boolean isWinner(){
        //      Checks to see if...
        //      row one is matching                       or  row two is matching                       or  row three is matching
        return (row1[0] == row1[1] && row1[1] == row1[2]) || (row2[0] == row2[1] && row2[1] == row2[2]) || (row3[0] == row3[1] && row3[1] == row3[2]);
    }
}

