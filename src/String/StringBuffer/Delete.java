package String.StringBuffer;

public class Delete {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello Bikesh");

        sb.delete(6, 12);

        System.out.println(sb);
    }
}
