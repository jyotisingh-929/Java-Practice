package Recursion;

import java.util.Scanner;

public class PrintNToOne {
    public static void print(int i,int n){
        if(i<1){
            return;
        }
        System.out.println(i);
        print(i-1,n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n!");
        int n = sc.nextInt();
        print(n,n);

    }
}
