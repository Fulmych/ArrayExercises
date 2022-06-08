package Application;
import java.util.Arrays;
public class ArrayExercise4 {
    public static void main(String[] args) {
        int[] array1 = {1, 15, 20};
        int[] array2 = {54, 48, 31};
        System.out.println("Before cloning:\nFirst Array: " + array1[0] + ", " + array1[1] + ", " + array1[2] + "\n" + "Second Array: " + array2[0] + ", " + array2[1] + ", " + array2[2]);
        array2 = array1.clone();
        System.out.println("After cloning:\nFirst Array: " + array1[0] + ", " + array1[1] + ", " + array1[2] + "\n" + "Second Array: " + array2[0] + ", " + array2[1] + ", " + array2[2]);
    }
}
