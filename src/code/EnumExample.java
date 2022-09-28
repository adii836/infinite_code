package code;

import java.awt.*;

enum color{
    RED("red"),
    BLUE,
    Green;
    String name;

    private color(){
        System.out.println("constructor called for :" + this.toString());
    }

    private color(String name){
        this.name= name;
        System.out.println(" constructor is parameterised : "+ name);
    }

    public void colorInfo()
    {
        System.out.println("Universal Color= "+name);
    }


}

public class EnumExample {

    public static void main(String[] args) {
            color c1 = color.RED;
            System.out.println("c1.ordinal() = " + c1.ordinal());
            System.out.println(c1);
            c1.colorInfo();

        System.out.println(color.valueOf("RED"));

            color arr[] = color.values();
            // enum with loop
            for( color col : arr) {
                // Calling ordinal() to find index
                // of color.
                System.out.println(col + " at index "
                        + col.ordinal());
            }

    }
}
