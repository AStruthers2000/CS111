public class InsectDemo {
    public static void main(String[] args){
        Grasshopper grasshopper = new Grasshopper();
        Beetle beetle = new Beetle(true);

        grasshopper.setLifeSpanDays(10);
        grasshopper.setJumpDist(12.370);

        beetle.setLifeSpanDays(12);
        beetle.setStink(3);

        System.out.println("The grasshopper \"hoppy\" can jump " + grasshopper.getJumpDist() + "cm.");
        System.out.println("She has a life span of " + grasshopper.getLifeSpan() + " days.");
        System.out.println("She has " + grasshopper.getNumLegs() + " legs.");

        System.out.println("The beetle \"stinker\" has a life span of " + beetle.getLifeSpan() + " days.");
        System.out.println("He has " + beetle.getNumLegs() + " legs.");
        System.out.println("Is he a big stinker? " + beetle.getIsABigStink());
    }
}
