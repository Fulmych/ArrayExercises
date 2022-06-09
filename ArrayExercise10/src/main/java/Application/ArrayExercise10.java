package Application;
public class ArrayExercise10 {
    public static void main(String[] args) {
        int[][] multiTable = new int[2][10];
        multiTable[0][0] = 1;
        multiTable[0][1] = 2;
        multiTable[0][2] = 3;
        multiTable[0][3] = 4;
        multiTable[0][4] = 5;
        multiTable[0][5] = 6;
        multiTable[0][6] = 7;
        multiTable[0][7] = 8;
        multiTable[0][8] = 9;
        multiTable[0][9] = 10;
        multiTable[1][0] = 1;
        multiTable[1][1] = 2;
        multiTable[1][2] = 3;
        multiTable[1][3] = 4;
        multiTable[1][4] = 5;
        multiTable[1][5] = 6;
        multiTable[1][6] = 7;
        multiTable[1][7] = 8;
        multiTable[1][8] = 9;
        multiTable[1][9] = 10;

        System.out.println(multiTable[0][0] + "\t" + multiTable[0][1] + "\t" + multiTable[0][2] + "\t" + multiTable[0][3] + "\t" + multiTable[0][4] + "\t" + multiTable[0][5] + "\t" + multiTable[0][6] + "\t" + multiTable[0][7] + "\t" + multiTable[0][8] + "\t" + multiTable[0][9] + "\n" +
                multiTable[1][1] + "\t" + (multiTable[1][1]*multiTable[0][1]) + "\t" + (multiTable[1][1]*multiTable[0][2]) + "\t" + (multiTable[1][1]*multiTable[0][3]) + "\t" + (multiTable[1][1]*multiTable[0][4]) + "\t" + (multiTable[1][1]*multiTable[0][5]) + "\t" + (multiTable[1][1]*multiTable[0][6]) + "\t" + (multiTable[1][1]*multiTable[0][7]) + "\t" + (multiTable[1][1]*multiTable[0][8]) + "\t" + (multiTable[1][1]*multiTable[0][9]) + "\n" +
                multiTable[1][2] + "\t" + (multiTable[1][2]*multiTable[0][1]) + "\t" + (multiTable[1][2]*multiTable[0][2]) + "\t" + (multiTable[1][2]*multiTable[0][3]) + "\t" + (multiTable[1][2]*multiTable[0][4]) + "\t" + (multiTable[1][2]*multiTable[0][5]) + "\t" + (multiTable[1][2]*multiTable[0][6]) + "\t" + (multiTable[1][2]*multiTable[0][7]) + "\t" + (multiTable[1][2]*multiTable[0][8]) + "\t" + (multiTable[1][2]*multiTable[0][9]) + "\n" +
                multiTable[1][3] + "\t" + (multiTable[1][3]*multiTable[0][1]) + "\t" + (multiTable[1][3]*multiTable[0][2]) + "\t" + (multiTable[1][3]*multiTable[0][3]) + "\t" + (multiTable[1][3]*multiTable[0][4]) + "\t" + (multiTable[1][3]*multiTable[0][5]) + "\t" + (multiTable[1][3]*multiTable[0][6]) + "\t" + (multiTable[1][3]*multiTable[0][7]) + "\t" + (multiTable[1][3]*multiTable[0][8]) + "\t" + (multiTable[1][3]*multiTable[0][9]) + "\n" +
                multiTable[1][4] + "\t" + (multiTable[1][4]*multiTable[0][1]) + "\t" + (multiTable[1][4]*multiTable[0][2]) + "\t" + (multiTable[1][4]*multiTable[0][3]) + "\t" + (multiTable[1][4]*multiTable[0][4]) + "\t" + (multiTable[1][4]*multiTable[0][5]) + "\t" + (multiTable[1][4]*multiTable[0][6]) + "\t" + (multiTable[1][4]*multiTable[0][7]) + "\t" + (multiTable[1][4]*multiTable[0][8]) + "\t" + (multiTable[1][4]*multiTable[0][9]) + "\n" +
                multiTable[1][5] + "\t" + (multiTable[1][5]*multiTable[0][1]) + "\t" + (multiTable[1][5]*multiTable[0][2]) + "\t" + (multiTable[1][5]*multiTable[0][3]) + "\t" + (multiTable[1][5]*multiTable[0][4]) + "\t" + (multiTable[1][5]*multiTable[0][5]) + "\t" + (multiTable[1][5]*multiTable[0][6]) + "\t" + (multiTable[1][5]*multiTable[0][7]) + "\t" + (multiTable[1][5]*multiTable[0][8]) + "\t" + (multiTable[1][5]*multiTable[0][9]) + "\n" +
                multiTable[1][6] + "\t" + (multiTable[1][6]*multiTable[0][1]) + "\t" + (multiTable[1][6]*multiTable[0][2]) + "\t" + (multiTable[1][6]*multiTable[0][3]) + "\t" + (multiTable[1][6]*multiTable[0][4]) + "\t" + (multiTable[1][6]*multiTable[0][5]) + "\t" + (multiTable[1][6]*multiTable[0][6]) + "\t" + (multiTable[1][6]*multiTable[0][7]) + "\t" + (multiTable[1][6]*multiTable[0][8]) + "\t" + (multiTable[1][6]*multiTable[0][9]) + "\n" +
                multiTable[1][7] + "\t" + (multiTable[1][7]*multiTable[0][1]) + "\t" + (multiTable[1][7]*multiTable[0][2]) + "\t" + (multiTable[1][7]*multiTable[0][3]) + "\t" + (multiTable[1][7]*multiTable[0][4]) + "\t" + (multiTable[1][7]*multiTable[0][5]) + "\t" + (multiTable[1][7]*multiTable[0][6]) + "\t" + (multiTable[1][7]*multiTable[0][7]) + "\t" + (multiTable[1][7]*multiTable[0][8]) + "\t" + (multiTable[1][7]*multiTable[0][9]) + "\n" +
                multiTable[1][8] + "\t" + (multiTable[1][8]*multiTable[0][1]) + "\t" + (multiTable[1][8]*multiTable[0][2]) + "\t" + (multiTable[1][8]*multiTable[0][3]) + "\t" + (multiTable[1][8]*multiTable[0][4]) + "\t" + (multiTable[1][8]*multiTable[0][5]) + "\t" + (multiTable[1][8]*multiTable[0][6]) + "\t" + (multiTable[1][8]*multiTable[0][7]) + "\t" + (multiTable[1][8]*multiTable[0][8]) + "\t" + (multiTable[1][8]*multiTable[0][9]) + "\n" +
                multiTable[1][9] + "\t" + (multiTable[1][9]*multiTable[0][1]) + "\t" + (multiTable[1][9]*multiTable[0][2]) + "\t" + (multiTable[1][9]*multiTable[0][3]) + "\t" + (multiTable[1][9]*multiTable[0][4]) + "\t" + (multiTable[1][9]*multiTable[0][5]) + "\t" + (multiTable[1][9]*multiTable[0][6]) + "\t" + (multiTable[1][9]*multiTable[0][7]) + "\t" + (multiTable[1][9]*multiTable[0][8]) + "\t" + (multiTable[1][9]*multiTable[0][9]));
    }
}
