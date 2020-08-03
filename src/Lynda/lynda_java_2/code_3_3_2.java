package Lynda.lynda_java_2;

public class code_3_3_2 {
    public static void main(String[] args) {

        int[][] array = {{1, 2, 3}, {4, 0, 5}, {6, 7, 8}};
        end:
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if (array[row][col] == 0) {
                    continue end;
                }
                System.out.println(array[row][col]);
            }
        }
    }
}


