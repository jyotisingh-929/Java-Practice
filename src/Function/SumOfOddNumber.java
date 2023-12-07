package Function;
import java.util.*;

public class SumOfOddNumber {
    public static int sumOddNumber(int n){
        int sum = 0;
        for (int i=1; i<=n; i++){
            if (i % 2 != 0){
                sum = sum + i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();

        int odd = sumOddNumber(n);
        System.out.println(odd);
    }
}
