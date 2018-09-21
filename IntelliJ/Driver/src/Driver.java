import java.util.Random;

public class Driver{
    public static void main(String[] args){
        ArrayProcessor arrayProcess = new ArrayProcessor();
        
        int[] anArray = {0,0,0};
        Random rand = new Random();
        
        anArray[0] = rand.nextInt(10);
        anArray[1] = rand.nextInt(10);
        anArray[2] = rand.nextInt(10);

        System.out.println("The original array");
        arrayProcess.print3IntArray(anArray);

        System.out.println("The sorted array");
        arrayProcess.print3IntArray(arrayProcess.sort3IntArray(anArray));

        System.out.println("The sorted reversed array");
        arrayProcess.print3IntArray(arrayProcess.reverse3intArray(arrayProcess.sort3IntArray(anArray)));
    }
}

class ArrayProcessor {
    void print3IntArray(int[] anArray){
        for(int a = 0; a<3; a++){
            System.out.println("Entry " + a + " is " + anArray[a]);
        }
        System.out.println();
    }

    int[] sort3IntArray(int[] anArray){
        int[] sortedArray = {0,0,0};
        int[] spots = {0,0,0};

        int high = 0,mid, low = anArray[0];
        int highSpot = 0,midSpot = 0,lowSpot = 0;

        for(int a = 0; a<3; a++){
            if (anArray[a] > high){
                high = anArray[a];
                highSpot = a;
            }
            if(anArray[a] < low){
                low = anArray[a];
                lowSpot = a;
            }
        }

        spots[highSpot] = 1;
        spots[lowSpot] = 1;
        for(int a = 0; a<3; a++){
            if(spots[a] == 0){
                midSpot = a;
            }
        }
        mid = anArray[midSpot];

        sortedArray[0] = low;
        sortedArray[1] = mid;
        sortedArray[2] = high;

        return sortedArray;
    }

    int[] reverse3intArray(int[] anArray){
        return new int[]{anArray[2], anArray[1], anArray[0]};
    }
}
