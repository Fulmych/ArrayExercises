package Application;
import java.util.Arrays;
public class ArrayExercise5 {
    public static void main(String[] args) {
        String[][] places = new String[2][2];
        places[0][0] = "France";
        places[0][1] = "Paris";
        places[1][0] = "Sweden";
        places[1][1] = "Stockholm";

        System.out.println(places[0][0] + ", " + places[0][1] + "\n" + places[1][0] + ", " + places[1][1]);

    }
}
