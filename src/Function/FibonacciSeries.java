package Function;

import java.util.*;
public class FibonacciSeries {

    public static void fibonacci(int n){
        int n1 = 0, n2 = 1;
        for (int i=0; i<n; i++){
            System.out.println(n1+" ");
            int n3 = n2 + n1;
            n1 = n2;
            n2 = n3;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n!");
        int n = sc.nextInt();

        fibonacci(n);
    }
}
