package ForLoop;

import java.util.Scanner;

public class TableUserInput {
    public static void main(String[] args) {
        System.out.println("Enter the Number__");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.print(n * i+" ");
//            System.out.println(n * i);
        }
    }
}
