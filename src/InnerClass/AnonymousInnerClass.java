package InnerClass;

abstract class Student{

    abstract void details();
}

public class AnonymousInnerClass {
    public static void main(String[] args) {

        Student s = new Student() {

            @Override
            void details(){
                System.out.println("This is anonymous inner class.");
            }
        };

        s.details();
    }
}
