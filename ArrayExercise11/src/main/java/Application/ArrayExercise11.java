package Application;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayExercise11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array1 = new int[200];
        int b = 0;
        String add;
        boolean stop = false;
        while (!stop) {
            int a;
            System.out.print("Choose a number to add into the array or type 0 to stop: ");
            add = scan.nextLine();
            if (add.equals("0")) {
                stop = true;
            } else {
                a = Integer.parseInt(add);
                for (int i = 0; i < 1;i++) {
                    array1[b] = a;
                    b++;
                }
            }
        }
        int[] finalArray1 = Arrays.copyOf(array1, b);
        int d=0;
        int c=b-1;
        System.out.println(Arrays.toString(finalArray1));
        int[] array2 = new int[b];
        for (int j=0; j<b;j++){
            array2[d] = finalArray1[c];
            d++;
            c--;
        }
        System.out.println(Arrays.toString(array2));
    }
}