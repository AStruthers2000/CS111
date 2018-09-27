public class Program {
    public static void main(String[] args){
        //I used the default arguments because I'm not sure if we were supposed to do inputs or not
        System.out.println("The area of a circle with a radius of 20.0 is " + Area.getArea(20.0));
        System.out.println("The area of a rectangle with a length of 10 and width of 20 is " + Area.getArea(10.0, 20.0));
        System.out.println("The area of a cylinder with radius 10.0 and height 15.0 is " + Area.getArea(10.0, 15.0, Math.PI));
    }
}
