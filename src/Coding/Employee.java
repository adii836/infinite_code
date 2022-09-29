package Coding;

import java.util.Scanner;

 class Employees {


    String id;
    String name;

    String Department;

    int age;
    String Address;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", Department='" + Department + '\'' +
                ", age=" + age +
                ", Address='" + Address + '\'' +
                '}';
    }
}
class Department {
    String dname;
    String did;

    public Department(){
        super();
    }

    public Department(String dname, String did) {
        this.dname = dname;
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }

    @Override
    public String toString() {
        return "Department{" +
                "dname='" + dname + '\'' +
                ", did='" + did + '\'' +
                '}';
    }
}

public class Employee{
    public static void main(String[] args) {
        Employees emp = new Employees();
        //Employees[] emparray = new Employees[1];
        Department dp = new Department();
/*
        emp.setId("121");
        emp.setName("aditya");
        emp.setAge(19);
        emp.setDepartment("cse");
        dp.setDid();*/
/*
        for (int i=0;i<=1;i++){
            emparray[i] = new Employees();

            emp.func(emparray[i]);

        }
*/
    }




        /*for (int i=0;i<=1;i++){
            emparray[i] = new Employees();
            emp.func(emparray[i]);

        }


        void func (Employees empe1){
            setData(empe1);
            getData(empe1);

        }

        void setData (Employees emp){
            Scanner sc = new Scanner(System.in);
            String id = sc.next();
            String name = sc.next();
            int age = sc.nextInt();
            String address = sc.next();


            emp.setId(id);
            emp.setName(name);
            emp.setAge(age);
            emp.setAddress(address);


        }

        void getData (Employee emp){
            System.out.println("emp.getId() = " + emp.getId());
            System.out.println("emp.getName() = " + emp.getName());
            System.out.println("emp.getAge() = " + emp.getAge());
            System.out.println("emp.getAddress() = " + emp.getAddress());


        }
*/
}

