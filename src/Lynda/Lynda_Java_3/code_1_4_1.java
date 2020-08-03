package Lynda.Lynda_Java_3;

public class code_1_4_1 {

        public static void main(String[] args) {
            String greetings = "Hello";
            update(greetings);
            System.out.println(greetings);

            StringBuilder greetings1 = new StringBuilder("Hello");
            update1(greetings1);
            System.out.println(greetings1);
        }

        static void update(String greetings){
            greetings = "Hello world!";
        }

        static void update1(StringBuilder greetings){
            greetings.append(" world!");
        }
    }

