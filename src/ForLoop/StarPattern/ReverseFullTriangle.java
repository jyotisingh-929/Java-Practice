package ForLoop.StarPattern;
import java.util.*;

public class ReverseFullTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of row:");
        int row = sc.nextInt();

        for (int i=row; i>=1; i--){
//            spaces
            for (int j=1; j<=row-i; j++){
                System.out.print(" ");
            }
//            triangle
            for (int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
