package Application;

import java.util.Arrays;

public class ArrayExercise9 {
    public static void main(String[] args) {
        int[] arrayShort = {1,2,3,4,5};
        int[] arrayLong = Arrays.copyOf(arrayShort, 10);
        int a = 5;
        for(int i = 0; i < 5; i++){
            arrayLong[a] = a+1;
            a++;
        }
        System.out.println("From this array: " + Arrays.toString(arrayShort) + "\nTo this: " + Arrays.toString(arrayLong));
    }
}
