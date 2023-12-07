package ForLoop.StarPattern;
import java.util.*;

public class Heart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i=1; i<=3; i++){
            for (int j=1; j<=15; j++){
                if ((j>=4-i && j<=4+i) || (j>=12-i && j<=12+i)){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i=8; i>=1; i--){
//            spaces
            for (int j=1; j<=8-i; j++){
                System.out.print(" ");
            }
//            stars
            for (int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
