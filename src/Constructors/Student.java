package Constructors;

public class Student {

    int age;
    String name;

    //Default Constructor
    Student(){
        name = "Bikesh";
        age = 20;
    }

    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }

    public static void main(String[] args) {
        Student st = new Student();

        st.display();
    }
}
