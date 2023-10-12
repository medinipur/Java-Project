import java.util.Random;
public class AutopasswordGenarate{

   static char[]AutopasswordGenarate(int len){
    System.out.print("Your password is: ");
    String charuper="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String charsmall="abcdefghijklmnopqrstuvwxyz";
    String num="1234567890";
    String special= "!@#$%^&*()<>?/{} ";
    String result=charuper+charsmall+num+special;

    Random rand= new Random();

    char[]password= new char[len];
     for(int i=0; i<len; i++){
        password[i]=result.charAt(rand.nextInt(result.length()));

     }
     return password;
    

   }

   public static void main(String[] args) {
    int length=8;
    System.out.println(AutopasswordGenarate(length));
   }
}