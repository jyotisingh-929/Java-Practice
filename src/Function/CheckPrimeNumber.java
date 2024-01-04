package Function;

import java.util.*;
public class CheckPrimeNumber {

    public static void PrimeNumber(int n){
        int flag = 0;
        int m = n / 2;
        if (n==0 || n==1){
            System.out.println(n+" is not Prime.");
        }else {
            for (int i=2; i<=m; i++){
                if (n%i==0){
                    System.out.println(n+" ia not Prime.");
                    flag = 1;
                    break;
                }
            }
        }if (flag==0){
            System.out.println(n+" is Prime.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n!");
        int n = sc.nextInt();

        PrimeNumber(n);


    }
}
