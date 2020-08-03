

package Lynda.lynda_java_2;

import java.util.*;
public class code_3_2_3 {

    public static void main(String[] args) {

        List<Character> list =
                new ArrayList<>(Arrays.asList('A', 'B', 'C'));

        for (Character  item : list) {
            System.out.println(item);
        }
    }
}
/*public class code_3_2_3 {
    public static void main(String[] args) {
        List<Character> list =
                new ArrayList<>(Arrays.asList('A', 'B', 'C'));
        //System.out.println(list);
        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    for(Character item : list){
      System.out.println(item);
      list.remove(item);
    }
        //System.out.println(list);
    }
*/




