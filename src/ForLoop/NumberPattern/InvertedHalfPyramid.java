package ForLoop.NumberPattern;
import java.util.*;

public class InvertedHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of row:");
        int row = sc.nextInt();
        int num = 1;

        for (int i=row; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print(num+" ");
            }
            num = num + 1;
            System.out.println();
        }
    }
}
