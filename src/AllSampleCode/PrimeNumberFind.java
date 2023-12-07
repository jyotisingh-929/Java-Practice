package AllSampleCode;
import java.util.*;

public class PrimeNumberFind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of number:");
        int n = sc.nextInt();

        int m, flag = 0;
        m = n / 2;
        if (n==0 || n==1){
            System.out.println(n+" is not a Prime Number.");
        }else {
            for (int i=2; i<=m; i++){
                if (n % i == 0){
                    System.out.println(n+" is not a Prime Number.");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0){
                System.out.println(n+" is a Prime Number.");
            }
        }
    }
}
