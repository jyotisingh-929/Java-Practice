package TimeAndSpaceComplexity;

import java.util.Scanner;

public class SpaceComplexity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=0; i<n; i++){
            System.out.println("Hello");
        }
    }
}

// Space Complexity
// in this code we store [ some scanner objects , variable n & variable i ]

// NOTE:- if we raise the value of n that mean space complexity will constant because it dose not store other variable
