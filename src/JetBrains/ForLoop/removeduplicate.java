package JetBrains.ForLoop;

import java.util.Scanner;

public class removeduplicate {

        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            String str = input.nextLine();
            String word="";
            for(int i=0;i<=str.length()-1;i++){
                if(str.charAt(i)==str.charAt(i+1)){
                    continue;
                }
                word+=str.charAt(i);
            }

            System.out.println(word);

            /*String result ="";
            for(int i = 0; i< str.length();i++) {
                if (i != str.length() - 1) {
                    if (str.charAt(i) == str.charAt(i + 1)) {
                        continue;
                    }
                    result += str.charAt(i);
                }else{
                    result += str.charAt(i);
                }
            }
            System.out.println(result);*/
        }

    }
