package runstone.loops;
//Finish the following code so that it prints a string minus
// the last character each time through the loop until
// there are no more characters in the string.
public class word_descending {
    public static void main(String[] args) {

                String a="kamil";
                for(int i=0;i<=a.length();){
                    System.out.println(a);
                    a=a.substring(0,a.length()-1);

                }

                    String message = "help";
                    while (message.length() > 0)
                    {
                        System.out.println(message);
                        message = message.substring(0,message.length() - 1);
                    }


            }
        }
