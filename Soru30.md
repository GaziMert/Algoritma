import java.util.HashMap;
import java.util.Scanner;
public class Soru30 {

   public static void main(String[] args) {
  String cumle;
 int deger;
     Scanner sc = new Scanner(System.in);
     HashMap<Character,Integer> hmap = new HashMap<Character,Integer>();
     System.out.println("Bir Cümle Giriniz:");
     cumle = sc.nextLine();
  for (int i=0; i<cumle.length(); i++){
           if(hmap.containsKey(cumle.charAt(i))){
        	   deger = hmap.get(cumle.charAt(i));
        	   deger ++;
             hmap.put(cumle.charAt(i),deger);
           }else{
   hmap.put(cumle.charAt(i),1);
           }
       }
       for ( Character C : hmap.keySet()){
           System.out.println("Karakter : '"+C+"' : "+hmap.get(C)+" kez kullanıldı.");
       }
   }
}
