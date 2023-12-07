package ForLoop.StarPattern;
import java.util.*;

public class DiamondStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of row:");
        int row = sc.nextInt();

//        upper half stars
        for (int i=1; i<=row; i++){
//            spaces
            for (int j=1; j<=row-i; j++){
                System.out.print(" ");
            }
//            stars
            for (int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

//        lower half stars

        for (int i=row; i>=1; i--){
//            spaces
            for (int j=1; j<=row-i; j++){
                System.out.print(" ");
            }
//            stars
            for (int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
