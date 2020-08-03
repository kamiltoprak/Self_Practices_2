package JetBrains.Switch;
import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.sql.SQLOutput;
import java.util.Scanner;
public class days {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
      int cookies =10;
      String day="tuesday";
      switch(day){
          case "sunday":
              cookies++;
          case "monday":
              cookies+=5;
              break;
          case "tuesday":
          case "wednesday":
              cookies+=10;
          case "thurday":
              cookies+=5;
              break;
          case "friday":
              break;
          case "saturday":
              cookies--;
              break;
          default:
              cookies=0;

              
      }
        System.out.println(cookies);
    }
}
