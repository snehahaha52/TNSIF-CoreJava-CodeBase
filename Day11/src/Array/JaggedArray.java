package Array;

class ArrayUtils {
    static void printArray(int c[][]) {
        System.out.println("Array elements are as follows:");
        for (int i = 0; i < c.length; i++) {   
            for (int j = 0; j < c[i].length; j++) {
                System.out.print(c[i][j] + " ");  
            }
            System.out.println();  
        }
    }
}

public class JaggedArray {

    public static void main(String[] args) {
        int c[][] = {
            {12, 23, 34},
            {10, 20},
            {50, 70, 56},
            {56, 76}
        };
        System.out.println("Number of rows in array: " + c.length);
        ArrayUtils.printArray(c);
    }
}
