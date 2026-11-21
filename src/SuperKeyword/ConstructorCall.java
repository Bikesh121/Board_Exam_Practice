package SuperKeyword;

class Employee{

    Employee(){
        System.out.println("This is parent class constructor.");
    }
}

class Teacher extends Employee{

    Teacher(){
        super();
        System.out.println("This is child class constructor.");
    }
}

public class ConstructorCall {
    public static void main(String[] args) {

        Teacher t = new Teacher();
    }
}
