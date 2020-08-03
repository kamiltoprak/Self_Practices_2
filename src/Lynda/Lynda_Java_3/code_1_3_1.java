package Lynda.Lynda_Java_3;

public class code_1_3_1 {

        static void print(){
            System.out.println("Hello World!");
        }

        public static void main(String[] args) {
            code_1_3_1 m = new code_1_3_1();
            m.print();
            print();
            m = null;
            m.print();
        }
    }
