package Lynda.lynda_java_2;
import java.util.*;
public class code_3_2_5 {
        public static void main(String[] args) {

            List<Character> list =
                    new ArrayList<>(Arrays.asList('A', 'B', 'C'));

            //System.out.println(list);

            for (int i=0; i<list.size(); i++){
                System.out.println(list.get(i));
                list.remove(i);
            }
        }
    }

