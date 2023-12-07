package AllSampleCode;
import java.util.*;

public class AreaCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius of Circle");
        double radius = sc.nextDouble();
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle = "+area);
    }
}
