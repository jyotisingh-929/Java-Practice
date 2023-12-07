package Function;
import java.util.*;

public class FactorialNumber {
    public static void calculateFactorial(int n){
        if (n < 0){
            System.out.println("Invalid Number");
            return;
        }
//        formula of factorial
        int factorial = 1;
        for (int i=n; i>=1; i--){
            factorial = factorial * i;
        }
        System.out.println("Factorial of "+n+" number is = "+factorial);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();

        calculateFactorial(n);
    }
}
