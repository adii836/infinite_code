package code;
import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {

    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<String>();
        food.add("dosa");
        food.add("rice");
        food.add("chappati");
        food.add("rajma");
        System.out.println(food);

        findLOngest(food);

        for (int i=0; i< food.size();i++) {
            System.out.println(food.get(i));
        }

        System.out.println("====================");
        for (Object l:food) {

            System.out.println(food);

        }

        ArrayList fnew = new ArrayList();
        fnew.add(12);
        fnew.add(10);
        fnew.add(14);
        fnew.add(20);
        fnew.add("aditya");

        for (Object f: fnew) {
            System.out.println(f);
        }

    }

    public static void findLOngest(List<String> list){

        String Longest="";
        for (String s : list){
            if(s.length()>Longest.length()){
                Longest =s;
            }
        }

        System.out.println("Longest word is : " + Longest);
    }
}
