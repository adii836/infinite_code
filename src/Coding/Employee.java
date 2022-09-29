package Coding;

import java.util.Scanner;

 class Employees {


    String id;
    String name;

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
        Employees emp[] = new Employees[10];
        //Employees[] emparray = new Employees[1];
        Department dp[] = new Department[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < emp.length; i++) {

        emp[i] = new Employees();


        String id = sc.next();
        emp[i].setId(id);
        emp[i].setName(sc.next());
        emp[i].setAge(sc.nextInt());
        emp[i].setAddress(sc.next());
        dp[i].setDid(sc.next());
        dp[i].setDname(sc.next());

    }
        for (int i=0 ; i<emp.length;i++) {
            System.out.println(emp[i].toString() + dp[i].toString());
        }

        }
}

