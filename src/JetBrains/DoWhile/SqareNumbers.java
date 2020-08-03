package JetBrains.DoWhile;
// square until entered number
import java.util.Scanner;
public class SqareNumbers {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int N=scan.nextInt();
        int B=1;
        int C=1;
        do {
            C=B*B;
            if (C<=N){
                System.out.println(C);
            }
            B+=1;
        } while (C<=N);
    }
}
