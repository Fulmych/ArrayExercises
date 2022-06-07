package Application;
import java.util.Arrays;
public class ArrayExercise3 {
    public static void main(String[] args) {

        String[] cities = {"Paris", "London", "New York", "Stockholm"};
        Arrays.sort(cities);
        System.out.println(cities[0] + ", " + cities[1] + ", " + cities[2] + ", " + cities[3] );
    }
}
