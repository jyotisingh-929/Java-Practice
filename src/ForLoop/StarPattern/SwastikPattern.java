package ForLoop.StarPattern;
import java.util.*;

public class SwastikPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of row:");
        int row = sc.nextInt();
        int mid = row/2+1;

        for (int i=1; i<=row; i++){
            for (int j=1; j<=row; j++){
                if (i==mid || j==mid || (i==1 && j>=mid) || (j==1 && i<=mid) || (i==row && j<=mid) || (j==row && i>=mid)){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
