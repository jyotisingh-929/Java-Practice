package Recursion;

public class Factorial {
    public static int printFac(int n){
        if(n==1){
            return 1;
        }
        return n * printFac(n-1);

    }
    public static void main(String[] args) {
        int n = 10;
//        int ans = printFac(n);
//        System.out.println(ans);

        System.out.println(printFac(n));
    }
}
