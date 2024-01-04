package ForLoop.StarPattern;
import java.util.*;

public class HeartPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of upper row:");
        int row =sc.nextInt();
        System.out.println("Enter the value of other lower row:");
        int num = sc.nextInt();

        for (int i=2; i<=row; i++){
            for (int j=1; j<=row-i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            for (int j=2; j<=i; j++){
                System.out.print("*");
            }
            for (int j=1; j<=2*(row-i)+1; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            for (int j=2; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=num; i>=1; i--){
            for (int j=1; j<=num-i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<i; j++){
                System.out.print("*");
            }
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
