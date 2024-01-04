package Array;
import java.util.Scanner;
public class ArraySearchOneElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of Element in Array!");
        int n = sc.nextInt();

        int [] num =  new int[n];

        for (int i=0; i<num.length; i++){
            num[i] = sc.nextInt();
        }
        System.out.println("Enter the value of Find Element in Array!");
        int x = sc.nextInt();

        for (int i=0; i<num.length; i++){
            if (num[i] == x){
                System.out.println("X Found at index "+i);
            }
        }

    }
}
