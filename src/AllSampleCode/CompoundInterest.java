package AllSampleCode;
import java.util.*;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principle is : ");
        double principle = sc.nextDouble();
        System.out.println("Enter th rate is : ");
        double rate = sc.nextDouble();
        System.out.println("Enter the time is : ");
        double time = sc.nextDouble();
        System.out.println("Enter the frequency (per year) is : ");
        int frequency = sc.nextInt();

        double CI = principle * Math.pow(1 + (rate/frequency), time * frequency) - principle;
        System.out.println("Compound Interest is : "+CI);
    }
}
