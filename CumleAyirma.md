 import java.util.Scanner;


public class CumleAyirma {
   private static Scanner in;

public static void main(String[] args) {
       in = new Scanner(System.in);

       System.out.println("Bir Cümle Giriniz");
       String cumle = in.nextLine();

       showWords(cumle);
}

   public static void showWords(String cumle) {
       int space = cumle.indexOf("");
       cumle = cumle.substring(0,space) + "" + cumle.replaceAll("\\s+", "\n");
       System.out.println(cumle);
       
   }

}
