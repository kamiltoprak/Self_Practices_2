package JetBrains.IfStatements;

import java.util.*;

public class freebooks {
    public static void main(String[] args) {
        int freeBooks = 0;
        Scanner scan = new Scanner(System.in);
        boolean isPremiumCustomer = scan.nextBoolean();
        int nbooksPurchased = scan.nextInt();
        int n = nbooksPurchased / 8;
        int m = nbooksPurchased / 12;
        if(isPremiumCustomer) {
            if (nbooksPurchased >= 5 && nbooksPurchased < 8) {
                freeBooks += 1;
            } else if (nbooksPurchased >= 8) {
                freeBooks += (2 * n) + (1 * ((nbooksPurchased - (n * 8)) / 5));
            } else {

            }
        }
            else{
            if (nbooksPurchased >= 7 && nbooksPurchased < 12) {
                freeBooks += 1;
            } else if (nbooksPurchased >= 12) {
                freeBooks += (2 * m) + (1 * ((nbooksPurchased - (m * 12)) / 7));
            } else {

            }


        }

        System.out.println(freeBooks);

    }
}

