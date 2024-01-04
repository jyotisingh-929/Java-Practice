package TimeAndSpaceComplexity;

import java.util.*;

public class WorstTimeComplexity3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i=0; i<n; i++){
            System.out.println("Hello");
        }

        for (int j=0; j<m; j++){
            System.out.println("Hello");
        }
    }
}

//  n = 5                    m = 5
//  i = 0 to n               j = 0 to m
//  n times                  m times

// n times + m times  == n + m
// Time Complexity = O( n + m )

                                          // OR

//  n = 10^5                    m = 5
//  i = 0 to n               j = 0 to m
//  n times                  m times

// n times + m times  == n + m
// Time Complexity = O( n ) jiski input size jyada hogi utna time complexity hoga
