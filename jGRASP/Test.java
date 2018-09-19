import java.util.Scanner;

public class Test{
   public static String input(String msg){
      System.out.println(msg + ":");
      Scanner in = new Scanner(System.in);
      String input = in.nextLine();
      return input;
   }
   
   public static void main(String[] args){
      System.out.println("Test");
      System.out.println(input("Say something"));
   }
}