package ForLoop;

import java.util.*;

public class FirstAdd {
    public static void main(String[] args) {
//        print sum of first n natural number
//        int sum = 0;
//        for (int i = 1; i <= 5; i++){
//            sum = sum + i;
//        }
//        System.out.println("Sum = "+sum);
        System.out.println("Enter the Number__");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++){
           sum = sum + i;
        }
        System.out.println("Sum = "+sum);
    }
}
