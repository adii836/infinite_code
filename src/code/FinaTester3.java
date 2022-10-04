package code;

class FinaTester3 {
    public static void main(String[] args) {
        Employee e=new Employee();
        PermanentEmployee pe=new PermanentEmployee();
    }
}
/*final */ class Employee{
    Employee() {
        System.out.println("Inside Final Parent Constructor");
    }
}

class PermanentEmployee extends Employee{  //creating child class for final parent class
    PermanentEmployee() {
        System.out.println("Inside child of Final Parent constructor.");
    }
}
// This class will throw compilation error saying "PermanentEmployee cannot subclass the final class Employee"


