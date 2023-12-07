package Function;
import java.util.*;

public class AverageOfThreeNumber {
//    create a function
    public static double averagePrint(double a, double b, double c){

        return (a + b + c)/3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        double a = sc.nextDouble();
        System.out.println("Enter the value of b:");
        double b = sc.nextDouble();
        System.out.println("Enter the value of c:");
        double c = sc.nextDouble();

        double average = averagePrint(a,b,c);
        System.out.println(average);
    }
}
