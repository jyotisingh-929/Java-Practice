package List;
import java.util.*;
public class ListExplain {


    public static void main(String args[]){

        int arr[]=new int[5];

        List<Integer> list = new ArrayList<>();

        arr[0]=4;

        list.add(4);

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        for(int i=0;i<list.size();i++){

            System.out.println(list.get(i));
        }


    }
}
