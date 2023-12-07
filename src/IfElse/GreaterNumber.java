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
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b){
            System.out.println("Equal");
        }else if (a > b){
            System.out.println("A is Greater");
        }else {
            System.out.println("A is Less");
        }
    }
}
