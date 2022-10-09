package code;

public class ArrayLengthTester<T1,T2>{

    public String LengthTester(T1[] arr1 , T2[] arr2){
            return (arr1.length== arr2.length?"equals":"Not Equals");
        }

    public static void main(String[]args){

        String[] sarr ={"aditya","rachit","radhe","harsh"};
        Integer[] a1={1,2,3};
        Integer[] a2 ={4,5,6};

        ArrayLengthTester<String,Integer> tester1 = new
        ArrayLengthTester<String,Integer>();
        System.out.println(tester1.LengthTester(sarr, a1));

        ArrayLengthTester<Integer,Integer> tester2 = new ArrayLengthTester<Integer,Integer>();
        System.out.println(tester2.LengthTester(a1,a2));


    }

}
