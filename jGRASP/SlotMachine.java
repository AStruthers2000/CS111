import java.util.Arrays;
import java.util.Random;

public class SlotMachine {
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
