package JetBrains.IfStatements;
import java.util.Scanner;
public class route {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String start = scan.next();
            String end = scan.next();
            String output = "right-down -left -up   -right-down -left";

            if(start.equals(end)) output = end + " found";
            else {
                int init = (start.charAt(0) - 'A') * 6;
                int out = (end.charAt(0) - 'A') * 6 - 1;
                if (out < init) out += 24;
                output = output.substring(init, out).replaceAll("\\s", "").replaceAll(
                        "-", " > ") + ": " + end + " found";
            }
            System.out.println(output);
        }
    }

