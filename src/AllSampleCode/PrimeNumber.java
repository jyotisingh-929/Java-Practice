package AllSampleCode;
import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of number:");
        int num = sc.nextInt();
        boolean isPrime = num > 1 && java.math.BigInteger.valueOf(num).isProbablePrime(1);
        if (isPrime){
            System.out.println(num+ " is Prime.");
        }else {
            System.out.println(num+ " is not Prime.");
        }
    }
}
