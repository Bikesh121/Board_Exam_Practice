package ThisKeyword;

public class Employee {
    int salary;

    Employee(){
        this(35000);
        System.out.println("Default constructor!");
    }

    Employee(int salary){
        System.out.println("Salary: "+salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
    }
}
