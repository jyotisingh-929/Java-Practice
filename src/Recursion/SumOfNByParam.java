package Recursion;

import java.util.Scanner;

public class SumOfNByParam {
    public static void printSum(int i,int sum){
        if(i<1){
            System.out.println("Sum of n = "+sum);
            return;
        }
        printSum(i-1,sum+i);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n!");
        int n = sc.nextInt();
        printSum(n,0);
    }
}
