package Lynda.Lynda_Java_3;

public class code_1_2_1 {

        public static void main(String[] args) {
            print(45);
            print(42L);
        }

        static void print(Long num){
            System.out.println(num);
        }

        static void print(Object obj){
            System.out.println("object: "+obj);
        }
    }

