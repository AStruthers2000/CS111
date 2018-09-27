public class copyArray{
    public static void main(String[] args){
        int[] arrayOfInts = {56,45,34};
        int[] duplicateInts = new int[6];
        int arrayIndex = 0;
        for(int i = 0; i<arrayOfInts.length; i++){
            duplicateInts[arrayIndex] = arrayOfInts[i];
            duplicateInts[arrayIndex+2] = arrayOfInts[];
        }
        System.out.println(Arrays.toString(duplicateInts));
    }
}