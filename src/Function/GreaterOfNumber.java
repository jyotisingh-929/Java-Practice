package Function;
import java.util.*;

public class GreaterOfNumber {
    public static double greaterNumber(double a, double b){
        if (a > b){
            return a;
        }else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        double a = sc.nextDouble();
        System.out.println("Enter the value of b:");
        double b = sc.nextDouble();

        double greater = greaterNumber(a,b);
        System.out.println(greater+" is a Greater number.");
    }
}
