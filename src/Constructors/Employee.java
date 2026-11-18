package Constructors;

public class Employee {

    String name;
    int salary;

    //Parameterized Constructor
    Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    void display(){
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Bikesh", 35000);
        Employee e2 = new Employee("Jharendra", 40000);

        e1.display();
        e2.display();
    }
}
