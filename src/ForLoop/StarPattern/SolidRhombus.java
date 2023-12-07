package ForLoop.StarPattern;
import java.util.*;

public class SolidRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of row:");
        int row = sc.nextInt();

        for (int i=1; i<=row; i++){
//            spaces
            for (int j=1; j<=row-i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=5; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
