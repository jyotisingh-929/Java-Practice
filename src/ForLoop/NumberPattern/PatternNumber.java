package ForLoop.NumberPattern;
import java.util.*;

public class PatternNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Row:");
        int row = sc.nextInt();

        for (int i=1; i<=row; i++){
            for (int j=1; j<=row-i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
