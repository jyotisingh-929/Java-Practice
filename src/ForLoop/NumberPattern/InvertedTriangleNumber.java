package ForLoop.NumberPattern;
import java.util.*;

public class InvertedTriangleNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row:");
        int row = sc.nextInt();
        for (int i=row; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
