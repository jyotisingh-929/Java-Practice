package ForLoop.StarPattern;
import java.util.*;

public class TriangleStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of row:");
        int row = sc.nextInt();

        for (int i=1; i<=row; i++){
//            spaces
            for (int j=1; j<=row-i; j++){
                System.out.print(" ");
            }
//            stars
            for (int j=i; j>=1; j--){
                System.out.print("*");
            }
            for (int j=2; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
