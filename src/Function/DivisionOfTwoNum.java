package Function;
import java.util.*;

public class DivisionOfTwoNum {
    public static int calculateDivision(int a, int b){
       int c = a / b;
       return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = sc.nextInt();
        System.out.println("Enter the value of b:");
        int b = sc.nextInt();

        int div = calculateDivision(a,b);
        System.out.println("Division of 2 number is = "+div);
    }
}
