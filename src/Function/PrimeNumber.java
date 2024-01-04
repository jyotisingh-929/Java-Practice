package Function;

import java.util.*;

public class PrimeNumber {

    public static boolean isPrime(int n){
        if (n <= 1){
            return false;
        }
        for (int i=2; i<=Math.sqrt(n); i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n!");
        int n = sc.nextInt();

        if (isPrime(n)){
            System.out.println(n+" is Prime Number.");
        }else {
            System.out.println(n+" is not Prime Number.");
        }
    }
}
