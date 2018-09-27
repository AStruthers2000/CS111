
public class Area {
    //Overloaded method one, takes double radius as argument
    public static double getArea(double radius){
        //Uses math.PI instead of an argument so the other two methods work
        return Math.PI * Math.pow(radius, 2);
    }

    //Overloaded method two, takes double width and double length
    public static double getArea(double width, double length){
        return width*length;
    }

    //Overloaded method three, takes double radius, double height, and double pi
    //because there needs to be a third argument for the overloaded method to not be a duplicate
    public static double getArea(double radius, double height, double pi){
        return Math.pow(radius, 2)*pi*2 + 2*pi*radius*height;
    }
}
