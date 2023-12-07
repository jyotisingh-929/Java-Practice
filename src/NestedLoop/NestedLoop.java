package NestedLoop;

public class NestedLoop {
    public static void main(String[] args) {
//        print solid pattern
        int n = 4;
        int m = 5;
//        outer loop
        for (int i = 1; i <= n; i++){
//            inner loop
            for (int j = 1; j <= m; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
