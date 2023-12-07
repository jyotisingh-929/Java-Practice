package AllSampleCode;
import java.util.*;

public class CheckEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of Number :");
        int n = sc.nextInt();
        if (n%2==0){
            System.out.println("Number Is Even!");
        }else {
            System.out.println("Number Is Odd");
        }
    }
}
