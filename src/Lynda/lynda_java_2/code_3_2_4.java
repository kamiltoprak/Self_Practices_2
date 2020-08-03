package Lynda.lynda_java_2;
import java.util.*;

public class code_3_2_4 {

        public static void main(String[] args) {

            List<Character> list =
                    new ArrayList<>(Arrays.asList('A', 'B', 'C'));

            for(Character item : list){
                System.out.println(item);
                //list.remove(item);
            }
        }
    }

