package Recursion;

import java.util.Scanner;

public class FactorialOfNByFunctional {
    public static int printFactorial(int n){
        if(n==1){
            return 1;
        }
        return n * printFactorial(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n!");
        int n = sc.nextInt();
        System.out.println(printFactorial(n));
    }
}
