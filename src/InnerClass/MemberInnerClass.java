package InnerClass;

class Outer{

    class Inner{

        void display(){
            System.out.println("This is member inner class.");
        }
    }
}

public class MemberInnerClass {
    public static void main(String[] args) {

        Outer out = new Outer();
        Outer.Inner in = out.new Inner();

        in.display();
    }
}
