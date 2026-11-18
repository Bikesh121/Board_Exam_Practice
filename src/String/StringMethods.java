package String;

public class StringMethods {
    public static void main(String[] args) {

        String s1 = "Hello Java";

        System.out.println(s1.length());
        System.out.println(s1.charAt(4));
        System.out.println(s1.substring(0,5));
        System.out.println(s1.replace("Java", "World"));
        System.out.println(s1.contains("Java"));
    }
}
