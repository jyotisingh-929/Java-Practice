package AllSampleCode;
import java.util.*;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width of the rectangle is : ");
        double width = sc.nextDouble();
        System.out.println("Enter the length of the rectangle is : ");
        double length = sc.nextDouble();
        double area = width * length;
        System.out.println("Area of the Rectangle is : "+area);
    }
}
