package Recursion;

public class ReverseArrayByTwoVariable {
    public static void printArray(int arr[],int n){
        System.out.print("Reversed Array is:- ");
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void reverseArray(int arr[],int start,int end){
        if(start>=end){
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArray(arr,start+1,end-1);
    }
    public static void main(String[] args) {
        int n = 4;
        int arr[] = {1,2,3,4};
        reverseArray(arr,0,n-1);
        printArray(arr,n);
    }
}
