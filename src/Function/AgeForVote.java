package Function;
import java.util.*;

public class AgeForVote {

    public static boolean eligibleForVote(int age){

        return age > 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of age:");
        int age = sc.nextInt();

        boolean isEligible = eligibleForVote(age);
        if (isEligible){
            System.out.println("You are eligible to vote.");
        }else {
            System.out.println("You are not eligible to vote.");
        }
    }
}
