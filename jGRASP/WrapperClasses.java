public class WrapperClasses{
    public static void main(String[] args){
        String non = "Cent Wash Univ";
        int last = non.lastIndexOf("Univ");
        int first = non.lastIndexOf("wash");
        System.out.println(last);
        System.out.println(first);
        System.out.println(last + (5*first));
        String redic = non.substring(last + (5*first), last);
        System.out.println('"' + redic + '"');
    }
}