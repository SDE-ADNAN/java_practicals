package com.adnan;

import java.util.Scanner;

public class largest_of_three {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        //Q: find the largest of the three numbers :

//        int max = a;
//        if (b> max ){
//            max =b;
//        }
//        if( c>max){
//            max = c;
//        }


        int max =  Math.max(Math.max(a,b),c);

        System.out.println("largest number is   "+max);
    }

}
