package TimeAndSpaceComplexity;

import java.util.*;

public class TimeComplexity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=0; i<n; i++){
            System.out.println("Hello");
        }
    }
}

// time complexity is n times (linear)
// Time Complexity is directly proportional to Input n

// Three cases of Time Complexity
// 1: BEST CASE     ==> Omega(1)
// 2: AVERAGE CASE  ==> Theta(n+1/2)
// 3: WORST CASE    ==> O(n)
