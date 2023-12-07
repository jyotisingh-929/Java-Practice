package AllSampleCode;

import java.util.*;
public class AdditionTwoNo {
    public static void main(String[] args) {
//        Simple Addition

//        int a = 10, b = 5, sum;
//        sum = a + b;
//        System.out.println("Addition = "+sum);

//        Addition by user input

        System.out.println("Enter the value of a & b..");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int add;
        add = a + b;
        System.out.println("Addition = "+add);
    }
}
