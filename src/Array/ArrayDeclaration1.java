
// Array is a list of elements of the same type i.e. a list of integers, a list of booleans etc.

package Array;

public class ArrayDeclaration1 {
    public static void main(String[] args) {
        // declares an Array of integers.
        int [] marks ;
        // allocating memory for 5 integers.
        marks = new int[4];
        // initialize the elements of the array
        marks[0] = 90;
        marks[1] = 95;
        marks[2] = 87;
        marks[3] = 85;

        for (int i=0; i<marks.length; i++){
            System.out.println("Element at index " +i+ " : " +marks[i]);
        }
        System.out.println("Array Length is "+marks.length);


    }
}
