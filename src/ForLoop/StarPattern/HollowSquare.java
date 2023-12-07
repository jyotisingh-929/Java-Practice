package ForLoop.StarPattern;
import java.util.*;

public class HollowSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of row:");
        int row = sc.nextInt();

        for (int i=1; i<=row; i++){
            for (int j=1; j<=row; j++){
                if (i==1 || j==1 || i==row || j==row){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
