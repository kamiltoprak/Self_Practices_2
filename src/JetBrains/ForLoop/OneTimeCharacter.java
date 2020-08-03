package JetBrains.ForLoop;
//printout one time each character
public class OneTimeCharacter {
    public static void main(String[] args) {
        /*String str = "AAABBBCCCDEF";
        String a="";
        for (int i = 0; i < str.length()-1; i++) {
                a=""+str.charAt(i);
            System.out.print(a);
                if (!str.substring(i+1,str.length()).contains(a)){
            }
        }*/
        System.out.println("==================================");
        System.out.println("================================================");
        String str1 = "aaabbbccccdddd";
        String result = "";
        for(int i = 0; i<= str1.length()-1;i++){
            if(!result.contains(str1.substring(i,i+1))){
                result+=str1.substring(i,i+1);
            }
        }
        System.out.print(result+" ");
        System.out.println("================================================");
        String str2 = "AAABBBCCCDEF";
        System.out.print(str2.charAt(0));
        for (int i = 1; i <str2.length()-1 ; i++) {
            if(str2.charAt(i)!=str2.charAt(i+1)){
                System.out.print(str2.charAt(i+1));
            }
        }

    }
}

