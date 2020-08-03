package Lynda.lynda_java_2;

public class code_3_3_1 {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 0, 5}, {6, 7, 8}};

        end:
        for(int row=0; row<array.length; row++){
            for(int col=0; col<array[row].length; col++){
                if(array[row][col] == 0){
                    break end;
                }
                System.out.println(array[row][col]);

            }
        }
        System.out.println("========================");
        System.out.println(array[0][0]);
        System.out.println(array.length);


    }

}
