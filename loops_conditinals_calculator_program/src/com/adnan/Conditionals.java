package com.adnan;

public class Conditionals {

    public static void main(String[] args) {
	// write your code here
        System.out.println("hello");
        /*
        * Syntax of if statements;
        * if (boolean expression T or F) {
        *     //body
        * }else{
        * // dothis
        *
        * */
//
//        int salary = 25400;
//        if(salary >1000){
//            salary = salary + 2000;
//        }else{
//            salary = salary + 1000;
//        }
//        System.out.println(salary);

       int salary = 25400;

       if (salary > 10000){
           salary += 2000; //salary = salary +2000
       }else if (salary > 20000){
           salary += 3000;

       }else{
           salary +=1000;
       }
        System.out.println(salary);





    }
}




