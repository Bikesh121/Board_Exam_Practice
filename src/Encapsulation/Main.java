package Encapsulation;

class Student{
    private int id;
    private String name;

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    void display(){
        System.out.println("ID of student: "+id);
        System.out.println("Name of student: "+name);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setId(101);
        s1.setName("Bikesh Ghimire");

        s1.display();
    }
}
