package AllSampleCode;
import java.util.*;

public class SwapTwoNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a is : ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b is : ");
        int b = sc.nextInt();
        System.out.println("Before Swapping : ");
        System.out.println("A is = "+a+"\nB is = "+b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("after Swapping : ");
        System.out.println("A is = "+a+"\nB is = "+b);
    }
}
