package IfElse;

import java.util.Scanner;
public class PrimeNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of num!");
        int num = sc.nextInt();
        int flag = 0, m;
        m = num/2;
        if (num==0 || num==1){
            System.out.println(num+" is not Prime Number");
        }
        else {
            for (int i=2; i<=m; i++){
                if (num%i==0){
                    System.out.println(num+" is not Prime Number");
                    flag = 1;
                    break;
                }
            }
            if (flag==0){
                System.out.println(num+" is Prime Number");
            }
        }
    }
}
