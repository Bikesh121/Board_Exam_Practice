class Student{
    int id;
}

public class PassByReference {

    static void change(Student s){
        s.id = 1002;
    }

    public static void main(String[] args) {
        Student s1 = new Student();

        s1.id = 1001;

        change(s1);

        System.out.println("ID: "+s1.id);
    }
}
