package ForLoop.StarPattern;
import java.util.*;

public class HollowButterFly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of row:");
        int row = sc.nextInt();

//        upper half

        for (int i=1; i<=row; i++){
//            first part star (left)
            for (int j=1; j<=i; j++){
                if (j==1 || j==i){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
//            spaces
            for (int j=1; j<=2*(row-i); j++){
                System.out.print(" ");
            }
//            second part star (right)
            for (int j=1; j<=i; j++){
                if (j==1 || j==i){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

//        lower half

        for (int i=row; i>=1; i--){
//            third part star
            for (int j=1; j<=i; j++){
                if (j==1 || j==i){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
//            spaces
            for (int j=1; j<=2*(row-i); j++){
                System.out.print(" ");
            }
//            fourth part star
            for (int j=1; j<=i; j++){
                if (j==1 || j==i){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
