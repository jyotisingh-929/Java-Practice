package List;

import java.util.*;

public class Factorial {
    public static void main(String[] args) {

        List<Long> list = new ArrayList<>();
        long n=7;
        print(n,list);
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
    public static void print(long n, List<Long> ans ){

        for (int i=1; i<=n; i++){
            long fac = 1;
            for (int j=1; j<=i; j++){
                 fac = fac * j;
            }
            if(fac<=n){
                ans.add(fac);
            }else {
                return;
            }
        }
    }
}
