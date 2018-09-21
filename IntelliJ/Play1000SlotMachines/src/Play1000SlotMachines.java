import java.util.Random;

public class Play1000SlotMachines {
    SlotMachine machine = new SlotMachine();

    public static SlotMachine[] genMachines(){
        SlotMachine[] machines = new SlotMachine[1000];
        for(int a = 0; a<1000; a++){
            machines[a] = new SlotMachine();
        }
        return machines;
    }

    public static void main(String[] args){
        int winCount = 0;

        for(SlotMachine machine : genMachines()){
            machine.playMachine();
            if(machine.isWinner()){
                winCount += 1;
            }
        }

        System.out.println("From 1000 slot machines, " + winCount + " were winners");
    }
}

class SlotMachine {
    private int[] row1 = new int[3];
    private int[] row2 = new int[3];
    private int[] row3 = new int[3];

    public void playMachine(){
        Random rand = new Random();
        for(int a = 0; a<3; a++){
            row1[a] = rand.nextInt(9)+1;
            row2[a] = rand.nextInt(9)+1;
            row3[a] = rand.nextInt(9)+1;
        }
    }

    public boolean isWinner(){return (row1[0] == row1[1] && row1[1] == row1[2]) || (row2[0] == row2[1] && row2[1] == row2[2]) || (row3[0] == row3[1] && row3[1] == row3[2]);}
}

