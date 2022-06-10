package Application;
import java.util.Arrays;
import java.util.Random;
public class ArrayExercise13 {
    public static void main(String[] args) {
        Random rand = new Random();
        int upperboundLow = 11;
        int upperboundHigh = 501;
        int d = rand.nextInt(upperboundLow);
        int[] array1 = new int[d];
        int[] array2 = new int[d];
        int a=0;
        for (int i = 0; i < d; i++){
            int int_random = rand.nextInt(upperboundHigh);
            array1[a] = int_random;
            a++;
        }
        System.out.println(Arrays.toString(array1));
        int b=0;
        int c=d-1;
        for (int j=0; j<d;j++){
            if (array1[j]%2==0){
                array2[b] = array1[j];
                b++;
            } else {
                array2[c] = array1[j];
                c--;
            }
        }
        System.out.println(Arrays.toString(array2));
    }
}
