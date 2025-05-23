package Encapsulation;

public class Student {
    public static void main(String[] args) {
        entity e1 = new entity();
        e1.setId(1);
        e1.setName("Hardik");
        e1.setSalary(100000);
        entity e2 = new entity();
        System.out.println("id: " + e1.getId() + " Name: " + e1.getName() + " Salary: "+ e1.getSalary());
        e2.setId(2);
        e2.setName("vivek");
        e2.setSalary(50000);
        System.out.println("id: " + e2.getId() + " Name: " + e2.getName() + " Salary: "+ e2.getSalary());
        entity e3 = new entity();
        e3.setId(2);
        e3.setName("Rahul");
        e3.setSalary(20000);
        System.out.println("id: " + e3.getId() + " Name: " + e3.getName() + " Salary: "+ e3.getSalary());
    }
}
