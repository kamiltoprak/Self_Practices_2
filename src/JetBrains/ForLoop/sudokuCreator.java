package JetBrains.ForLoop;

public class sudokuCreator {
    public static void main(String[] args) {
        for (int m = 0; m <3 ; m++) {
            for (int i = 1+m; i <= 9; i += 3) {
                for (int j = i; j <= 9; j++) {
                    System.out.print(j + " ");
                }
                for (int k = 1; k < i; k++) {
                    System.out.print(k + " ");
                }
                System.out.println();
            }
        }
    }
}
