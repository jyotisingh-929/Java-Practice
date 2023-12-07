package ForLoop.StarPattern;
import java.util.*;

public class ButterFlyPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of row:");
        int row = sc.nextInt();

//      UpperHalf

        for (int i=1; i<=row; i++){
//            1st part left star
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
//            spaces
            for (int j=1; j<=2*(row-i); j++){
                System.out.print(" ");
            }
//            2nd part right star
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

//      LowerHalf

        for (int i=row; i>=1; i--){
//            3rd part left star
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
//            spaces
            for (int j=1; j<=2*(row-i); j++){
                System.out.print(" ");
            }
//            4rth part right star
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
