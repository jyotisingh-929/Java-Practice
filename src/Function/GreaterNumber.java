package Function;
import java.util.*;

public class GreaterNumber {
    public static void printGreater(int a, int b){
        if (a > b){
            System.out.println("Greater Number = "+a);
        }else {
            System.out.println("Greater Number = "+b);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a:");
        int a = sc.nextInt();
        System.out.println("Enter value of b:");
        int b = sc.nextInt();
        printGreater(a,b);
    }
}
