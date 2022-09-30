package Coding;
class Details{

    String  Name;
    int yoj;
    String Address;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getYoj() {
        return yoj;
    }

    public void setYoj(int yoj) {
        this.yoj = yoj;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }



}
public class Emp {

    public static void main(String[] args) {
        Details[] d = new Details[3];
        Emp emp=new Emp();

//        d[0] = new Details();
//        d[0].setName("Robert");
//        d[0].setYoj(1994);
//        d[0].setAddress("64C-WallsStreat");
//
//        d[1] = new Details();
//        d[1].setName("Robert");
//        d[1].setYoj(1994);
//        d[1].setAddress("64C-WallsStreat");
//
//        d[2] = new Details();
//        d[2].setName("Robert");
//        d[2].setYoj(1994);
//        d[2].setAddress("64C-WallsStreat");


        System.out.println("Name"+ emp.AddDistance(); + "Year of Joining"+emp.AddDistance()+ "Address" );

        /*for (int i=0;i<d.length;i++){
            System.out.println(d[i].Name + AddDistance() +d[i].yoj + AddDistance()+d[i].Address);
        }*/



    }
    void AddDistance(){
        System.out.println("  ");

    }

}






