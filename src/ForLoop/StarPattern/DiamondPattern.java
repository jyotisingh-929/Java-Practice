package ForLoop.StarPattern;
import java.util.*;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of row:");
        int row = sc.nextInt();

        for (int i=1; i<=row; i++){
//            spaces
            for (int j=1; j<=row-i; j++){
                System.out.print(" ");
            }
//            first half stars
            for (int j=i; j>=1; j--){
                System.out.print("*");
            }
//            second half stars
            for (int j=2; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=row; i>=1; i--){
//            spaces
            for (int j=1; j<=row-i; j++){
                System.out.print(" ");
            }
//            third half stars
            for (int j=i; j>=1; j--){
                System.out.print("*");
            }
//            fourth half stars
            for (int j=i; j>=2; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
