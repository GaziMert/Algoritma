import java.util.Scanner;
public class Soru21 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int sayi,faktoriyel=1;
        
        System.out.println("Faktöriyelini almak istediğiniz sayıyı giriniz=");
        sayi=scan.nextInt();
        
        while(sayi<0)
        {
        	System.out.println("Lütfen 0 dan büyük bir sayı giriniz=");
        	sayi=scan.nextInt();
        }
      
        for(int i=1;i<=sayi;i++)
        {
        	faktoriyel=faktoriyel*i;
        }
        System.out.println(sayi+"!="+faktoriyel);
   }
}
