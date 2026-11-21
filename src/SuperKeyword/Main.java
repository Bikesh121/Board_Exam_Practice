package SuperKeyword;

class Student{

     int id = 101;
}

class Ram extends Student{

    String name = "Ram";

    void display(){

        System.out.println("ID: "+super.id);
        System.out.println("Name: "+name);
    }
}

public class Main {
    public static void main(String[] args) {

        Ram st = new Ram();

        st.display();
    }
}
