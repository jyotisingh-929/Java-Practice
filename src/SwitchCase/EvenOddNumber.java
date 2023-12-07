package SwitchCase;

import java.util.*;

class EvenOddNumber {
    public static void main(String[] args) {
        System.out.println("Enter the Number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int even = 0;
        int odd = 0;
        for (int i = 1; i <= n; i++){
           if (i%2==0){
              even = even + 1;
           }else {
               odd = odd + 1;
           }
        }
        System.out.print("Even No. = "+even+ "\nOdd No. = "+odd);

    }
}