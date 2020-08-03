package runstone.loops;
/*Use a while loop. Loop while x has been found in the message (using indexOf).
        Remove the x (using substring). Use indexOf again to get the position of
        the next x or -1 if there are none left in the message.*/
import java.sql.SQLOutput;

public class wordWithX {
    public static void main(String[] args) {

        String message = "Ix lovex youxxx";
        for (int x = 0; x < message.length(); ) {

            System.out.println(message);
            message = message.replaceFirst("x", "");
            if (message.indexOf("x") < 0) {
                break;
            }
        }

        System.out.println("====================");
        String message1 = "Ix lovex youxxx";
        int pos = message1.indexOf("x");
        while (pos >= 0) {
            System.out.println(message);
            message1 = message1.substring(0, pos) + message.substring(pos + 1);
            pos = message1.indexOf("x");
        }


    }
}

