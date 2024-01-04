package TimeAndSpaceComplexity;

import java.util.*;

public class WorstTimeComplexity2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i=0; i<n; i++){              // n times
            for (int j=0; j<m; j++){          // m times
                System.out.println("Hello");
            }
        }
    }
}

// n = 5     m = 5
// i = 0     j = 0,1,2,3,4  (m)
// i = 1     j = 0,1,2,3,4  (m)
// i = 2     j = 0,1,2,3,4  (m)
//   .
//   .
// i = n     j = 0,1 ---- m
// n times * m times  == n * m
// Time Complexity = O( n * m )