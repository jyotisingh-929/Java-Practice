package SwitchCase;

import java.util.Scanner;

public class NameMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        switch (str) {
            case "January"  :
                System.out.println(1);
                break;

            case "February" :
                System.out.println(2);
                break;

            case "March" :
                System.out.println(3);
                break;

            case "April" :
                System.out.println(4);
                break;

            case "May" :
                System.out.println(5);
                break;

            case "June" :
                System.out.println(6);
                break;

            case "July" :
                System.out.println(7);
                break;

            case "August" :
                System.out.println(8);
                break;

            case "September" :
                System.out.println(9);
                break;

            case "October" :
                System.out.println(10);
                break;

            case "November" :
                System.out.println(11);
                break;

            default:
                System.out.println(12);
        }
    }
}
