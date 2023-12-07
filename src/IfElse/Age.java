package IfElse;

import java.util.*;

public class Age {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age > 18){
            System.out.println("I'm Adult.");
        }
        else{
            System.out.println("I'm not Adult.");
        }

    }
}
