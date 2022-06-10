package Application;
import java.util.Arrays;
public class ArrayExercise8 {
    public static int removeDuplicates(int array[], int n){
        if (n==0||n==1){
            return n;
        }
        int[] tempArray = new int[n];
        int j = 0;
        for (int i=0; i<n-1; i++){
            if(array[i] != array[i+1]){
                tempArray[j++] = array[i];
            }
        }
        
        tempArray[j++] = array[n-1];
        for(int i=0; i<j; i++){
            array[i] = tempArray[i];
        }
        return j;
    }
    public static void main(String[] args) {
        int[] array = {20, 20, 40, 20, 30, 40, 50, 60, 50};
        Arrays.sort(array);
        int length = array.length;
        length = removeDuplicates(array, length);
        for (int i=0;i<length; i++){
            System.out.println(array[i]+" ");
        }
    }
}
