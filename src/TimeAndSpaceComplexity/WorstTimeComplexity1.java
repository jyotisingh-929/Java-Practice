package TimeAndSpaceComplexity;

import java.util.*;

public class WorstTimeComplexity1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=0; i<n; i++){             // n times
            for (int j=0; j<n; j++){         // n times
                System.out.println("Hello");
            }
        }
    }
}

// n = 5
// i = 0     j = 0,1,2,3,4  (n)
// i = 1     j = 0,1,2,3,4  (n)
// i = 2     j = 0,1,2,3,4  (n)
//   .
//   .
// i = n     j = 0,1 ---- n
// n times * n times  == n * n
// Time Complexity = O( n^2 )
