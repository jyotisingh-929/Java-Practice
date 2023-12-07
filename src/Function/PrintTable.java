package Function;
import java.util.*;

public class PrintTable {
    public static void tablePrint(int n){
        for (int i=1; i<=10; i++){
            System.out.println(n+" * "+i+" = "+n*i);
//            System.out.println(n*i);
        }
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();

        tablePrint(n);
    }
}
