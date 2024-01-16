package Recursion;

import java.util.Scanner;

public class FactorialOfNByParam {
    public static void printFactorial(int i, int Fac){
        if(i<1){
            System.out.println(Fac);
            return;
        }
        printFactorial(i-1,Fac * i);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n!");
        int n = sc.nextInt();
        printFactorial(n,1);
    }
}
