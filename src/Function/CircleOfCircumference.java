package Function;
import java.util.*;

public class CircleOfCircumference {

    public static double circumferenceOfCircle(double radius){
//        double C = 2 * 3.14 * radius;
//        return C;
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle:");
        double radius = sc.nextDouble();

        double circumference = circumferenceOfCircle(radius);
        System.out.println(circumference);
    }
}
