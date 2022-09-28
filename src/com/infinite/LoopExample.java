package com.infinite;

import java.util.Scanner;

public class LoopExample {

    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {
            System.out.println("hello " + i);
        }

        int k = 0;
        while (k < 10) {
            System.out.println("learn new things ");
            k++;
        }

        int i = 0;
        do {

            System.out.println("learn do-while loops");
            i++;
        } while (i < 10);

        LoopExample l1 = new LoopExample();
        l1.array();
        l1.MultiDimensional();
        l1.switchcase();
        l1.multiplearray();

    }

    void array() {
        int arr2[] = {1, 2, 3, 4, 5};

        for (int i = 0; i < arr2.length; i++) {
            System.out.println("arr : " + arr2[i]);
        }
        for (int b : arr2) {
            System.out.println("b = " + b);
        }

    }


    public void MultiDimensional() {
        int arr[][] = {{1, 2, 3, 4},
                {1, 5, 6},
                {9, 8, 7, 6, 5}
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                System.out.print("arr[" + i + "]" + "[" + j + "] : " + arr[i][j] + " ");
            }
            System.out.println("");
        }


    }
    void multiplearray(){
        int[][][] test = {
                {
                        {1, -2, 3},
                        {2, 3, 4}
                },
                {
                        {-4, -5, 6, 9},
                        {1},
                        {2, 3}
                }
        };
        // for..each loop to iterate through elements of 3d array
        for (int[][] array2D: test) {
            for (int[] array1D: array2D) {
                for(int item: array1D) {
                    System.out.print(item+"  ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    void switchcase() {
        int ch;
        Scanner sc = new Scanner(System.in);
        ch = sc.nextInt();
        switch (ch) {
            case 1:
                System.out.println("case 1 :");
                break;
            case 2:
                System.out.println("case 2 : ");
                break;
            case 3:
                System.out.println("case 3 : ");
                break;

            default:
                System.out.println("default");
                break;
        }

    }

}

