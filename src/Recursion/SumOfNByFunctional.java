package Recursion;

import java.util.Scanner;

public class SumOfNByFunctional {
    public static int printSum(int n){
        if(n==0){
            return 0;
        }
        return n + printSum(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n!");
        int n = sc.nextInt();
        System.out.println(printSum(n));
    }
}
