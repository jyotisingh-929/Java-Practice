package AllSampleCode;
import java.util.*;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principle of SI is : ");
        double principle = sc.nextDouble();
        System.out.println("Enter the rate of SI is : ");
        double rate = sc.nextDouble();
        System.out.println("Enter the time of SI is : ");
        double time = sc.nextDouble();
        double simpleInterest = (principle * rate * time) / 100;
        System.out.println("Simple Interest is = "+simpleInterest);
    }
}
