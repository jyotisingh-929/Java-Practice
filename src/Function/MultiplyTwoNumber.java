package Function;
import java.util.*;

public class MultiplyTwoNumber {
    public static int calculateTwo(int a, int b){
        return (a * b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = sc.nextInt();
        System.out.println("Enter the value of b:");
        int b = sc.nextInt();

        System.out.println("Multiplication of 2 number is = "+calculateTwo(a,b));
    }
}
