package code;

public class compareto {
    public static void main(String[] args) {
        String sum = "123";
        int mySum = Integer.parseInt(sum);
        System.out.println(mySum);

        Integer phoneNo = 44281234;
        Long phoneNo1 = phoneNo.longValue();
        System.out.println(phoneNo1);

        Character alphaObj = new Character('A');
        //Character digitObj = new Character('5');
       boolean result1 = Character.isDigit(alphaObj);
       // boolean result2 = Character.isUpperCase(alphaObj);
        System.out.println(result1);
        //System.out.println(result2);

    }
}
