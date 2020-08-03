package runstone.loops;

public class numbersTriangle {
    public static void main(String[] args) {

        for (int i = 5; i >= 2; i--) {
            for (int j = i; j >= 1; j--) {

                System.out.print(i);
            }
            System.out.println();

        }


        for (int x = 5; x >= 1; x--) {
            for (int y = x; y > 0; y--) {
                System.out.print(x);
            }
            System.out.println();
        }



    }
}

