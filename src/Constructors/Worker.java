package Constructors;

public class Worker {

    int id;
    String name;
    long salary;

    Worker(){
        id = 101;
        name = "Ram";
        salary = 25000;
    }

    Worker(int id, String name){
        this.id = id;
        this.name = name;
        salary = 32000;
    }

    Worker(int id, String name, long salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display(){
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
        System.out.println("--------------------------");
    }

    public static void main(String[] args) {
        Worker w1 = new Worker();
        Worker w2 = new Worker(102, "Hari");
        Worker w3 = new Worker(103, "Shyam", 28000);

        w1.display();
        w2.display();
        w3.display();
    }
}
