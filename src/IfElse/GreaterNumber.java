package IfElse;

import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args){
//        int a = 30, b = 20;
//        if (a == b){
//            System.out.println("Equal");
//        }
//        else {
//            if(a > b){
//                System.out.println("Grater");
//            }
//            else {
//                System.out.println("Less");
//            }
//        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a!");
        int a = sc.nextInt();
        System.out.println("Enter the value of b!");
        int b = sc.nextInt();

        if (a == b){
            System.out.println("Equal");
        }else if (a > b){
            System.out.println(a+ " is Greater Number!");
        }else {
            System.out.println(a+ " is Less Number!");
        }
    }
}
