package ForLoop.StarPattern;
import java.util.*;

public class HalfRightPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
//        Outer Loop
        for (int i=1; i<=row; i++){
//            Inner Loop
//            Print Space
            for (int j=1; j<=row-i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
