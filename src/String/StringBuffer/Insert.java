package String.StringBuffer;

public class Insert {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello Java");

        sb.insert(6, "my ");

        System.out.println(sb);
    }
}
