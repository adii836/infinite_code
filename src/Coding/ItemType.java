package Coding;

import java.util.Scanner;

public class ItemType {

    private String name;
    private Double costPerDay;
    private Double deposit;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCostPerDay() {
        return costPerDay;
    }

    public void setCostPerDay(Double costPerDay) {
        this.costPerDay = costPerDay;
    }

    public Double getDeposit() {
        return deposit;
    }

    public void setDeposit(Double deposit) {
        this.deposit = deposit;
    }



    public void display(){
        System.out.println("Item type details");
        System.out.println("Name :"+name);
        System.out.println("CostPerDay : "+costPerDay);
        System.out.println("Deposit : " +deposit);
    }

    public static void main(String[] args) {
        ItemType it = new ItemType();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the item type name");
        String iName = sc.next();

        System.out.println("Enter the cost per day");
        Double cpd = sc.nextDouble();

        System.out.println("Enter the deposit");
        Double iiDeposit = sc.nextDouble();

        it.setName(iName);
        it.setCostPerDay(cpd);
        it.setDeposit(iiDeposit);

        it.display();
    }
}
