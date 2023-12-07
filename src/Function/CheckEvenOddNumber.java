package Function;
import java.util.*;

public class CheckEvenOddNumber {
    public static void printEvenOdd(int n){
        if (n % 2 == 0){
            System.out.println(n+" is Even Number");
        }else {
            System.out.println(n+" is Odd Number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();

        printEvenOdd(n);
    }

}
