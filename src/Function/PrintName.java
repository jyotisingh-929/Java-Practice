package Function;
import java.util.*;

public class PrintName {
    public static void PrintMyName(String name){
        System.out.println(name);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        PrintMyName(name);
    }
}
