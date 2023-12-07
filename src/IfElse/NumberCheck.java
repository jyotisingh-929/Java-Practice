package IfElse;

import java.util.*;

public class NumberCheck {
    public static void main(String[] args){
//         int x = 5;
//         if (x % 2 == 0){
//             System.out.println("Even");
//         }
//         else{
//             System.out.println("Odd");
//         }
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if ( x % 2 == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
