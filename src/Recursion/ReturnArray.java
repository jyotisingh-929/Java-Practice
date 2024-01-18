package Recursion;

import java.util.Scanner;

public class ReturnArray {
    public static void main(String[] args) {
        int n = 10;
        int ans[] = printArray(n);
//        for (int i: ans){
//            System.out.print(i+" ");
//        }
//                                             OR

        for (int i=0; i<ans.length; i++){
            System.out.print(ans[i]+" ");
        }
    }
    public static void print(int arr[], int n){
        if(n==0){
            return;
        }
        print(arr,n-1);
        arr[n-1] = n;
    }
    public static int[] printArray(int n){
        int arr[] = new int[n];
        print(arr,n);
        return arr;
    }
}
