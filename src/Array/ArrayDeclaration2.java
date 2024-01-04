package Array;

public class ArrayDeclaration2 {
    public static void main(String[] args) {

        int marks[] = new int[4];
        marks[0] = 89;
        marks[1] = 80;
        marks[2] = 87;
        marks[3] = 78;

        for (int i=0; i<marks.length; i++){
            System.out.println("Element at index "+i+" : "+marks[i]);
        }
    }
}
