package ForLoop.NumberPattern;
import java.util.*;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of row:");
        int row = sc.nextInt();

        for (int i=0; i<row; i++){
//            spaces
            for (int j=1; j<=row-i; j++){
                System.out.print(" ");
            }
//            pascal number
            int num = 1;
            for (int j=0; j<=i; j++){
                System.out.print(num+" ");
                num = num *(i-j)/(j+1);
            }
            System.out.println();
        }
    }
}
