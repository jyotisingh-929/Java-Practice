package Recursion;

public class BaseCondition {
    static int count = 0;
    public static void print(){

        if(count==5) {
            return;
        }
        System.out.println(count);
        count = count + 1;
        print();
    }

    public static void main(String[] args) {
        print();
    }
}
