package InnerClass;

class outer{

    void display(){

        class inner{

            void show(){
                System.out.println("This is local inner class.");
            }
        }

        inner in = new inner();
        in.show();
    }
}

public class LocalInnerClass {
    public static void main(String[] args) {

        outer out = new outer();
        out.display();
    }
}
