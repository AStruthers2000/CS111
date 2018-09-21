public class Area {
    private static double getArea(double radius){
        return Math.PI * Math.pow(radius, 2);
    }
    private static double getArea(double width, double length){
        return width*length;
    }

    private static double getArea(double radius, double height, double pi){
        return Math.pow(radius, 2)*pi*2 + 2*pi*radius*height;
    }

    public static void main(String[] args){
        System.out.println("The area of a circle with a radius of 20.0 is " + getArea(20.0));
        System.out.println("The area of a rectangle with a length of 10 and width of 20 is " + getArea(10.0, 20.0));
        System.out.println("The area of a cylinder with radius 10.0 and height 15.0 is " + getArea(10.0, 15.0, Math.PI));

    }
}
