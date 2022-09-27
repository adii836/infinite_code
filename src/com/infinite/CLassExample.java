package com.infinite;

public class CLassExample {
    int id;
    String name;
    String Contact_no;
    String Address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact_no() {
        return Contact_no;
    }

    public void setContact_no(String contact_no) {
        Contact_no = contact_no;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public static void main(String[] args) {

        CLassExample c1 = new CLassExample();
        c1.setId(12);
        c1.setName("aditya raj");
        c1.setContact_no("8318874454");
        c1.setAddress("Benglore");

        System.out.println(c1.getId());
        System.out.println(c1.getName());
        System.out.println(c1.getContact_no());
        System.out.println(c1.getAddress());

        CLassExample c2 = new CLassExample();
        c2.setId(13);
        c2.setName("rachit");
        c2.setContact_no("8318874457");
        c2.setAddress("Jaunpur");

        System.out.println(c2.getId());
        System.out.println(c2.getName());
        System.out.println(c2.getAddress());
        System.out.println(c2.getContact_no());

    }
}
