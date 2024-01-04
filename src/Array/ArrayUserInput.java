package Array;
import java.util.Scanner;
public class ArrayUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of Array Element!");
        int n = sc.nextInt();

        int[] number = new int[n];

        // initialize the elements of the array

        for (int i=0; i<number.length; i++){
            number[i] = sc.nextInt();
        }

        for (int i=0; i<number.length; i++){
            System.out.println("Element at index "+i+ " : "+number[i]);
        }

    }
}
