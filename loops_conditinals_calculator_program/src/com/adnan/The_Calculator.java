package com.adnan;

import java.util.Scanner;

public class The_Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            // Take input till the user clicks X or x
        System.out.println("please select an operator from +,-,*,/,%");

        int ans = 0;

        while (true){
            // take the operator as input
            char op = in.next().trim().charAt(0);
            if(op == '+' || op == '-'||op == '*' || op == '/' || op == '%'){
                //taking two input ints
                System.out.println("first number");
                int num1 = in.nextInt();
                System.out.println("second number ");
                int num2 = in.nextInt();
               if (op == '+'){
                   ans = num1 + num2;
               }else if (op == '-'){
                   ans = num1 - num2;
               }else if (op == '*'){
                   ans = num1 * num2;
               }else if (op == '%'){
                   ans = num1 % num2;
               }else if (op == '/'){
                   if(num2 != 0){
                   ans = num1 / num2;}
               }

            }else if (op == 'x' || op == 'X'){
                break;
            }

            System.out.println("result is  :  "+ans);
        }


    }
}
