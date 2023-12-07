package ForLoop.StarPattern;
import java.util.*;

public class HalfPyramidInverted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
//        Outer Loop
        for (int i=row; i>=1; i--){
//            Inner Loop
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
