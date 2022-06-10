package Application;

import java.util.Arrays;

public class ArrayExercise7 {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Full array: " + Arrays.toString(array1));
        int[] array2 = new int[10];
        int a=0;
        int b=0;
        for (int i=0;i<10;i++){
            if (array1[a]%2!=0){
                array2[b] = array1[a];
                b++;
                a++;
            } else {
                a++;
            }
        }
        int[] array3 = Arrays.copyOf(array2, b);
        System.out.println("Uneven array: " + Arrays.toString(array3));

    }
}
