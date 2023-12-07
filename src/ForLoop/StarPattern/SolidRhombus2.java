package ForLoop.StarPattern;
import java.util.*;

public class SolidRhombus2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of row:");
        int row = sc.nextInt();
        System.out.println("Enter the number of stars:");
        int num = sc.nextInt();

        for (int i=1; i<=row; i++){
//            spaces
            for (int j=1; j<=row-i; j++){
                System.out.print(" ");
            }
//            stars
            for (int j=1; j<=num; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
