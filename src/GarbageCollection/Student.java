package GarbageCollection;

public class Student {
    int id;
    String name;

    public static void main(String[] args) {
        Student s1 = new Student();

        s1 = null;

        System.gc();

        System.out.println("Garbage collection requested!");
    }
}
