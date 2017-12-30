import java.util.Scanner;
public class Soru4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);		
	
     System.out.print("Uc Basamakli Bir Tam Sayi Giriniz: ");
     int sayi = scan.nextInt();

     
     int yuzler,onlar,birler;
     
     yuzler = sayi/100;
     sayi = sayi%100;
     onlar =sayi/10;
     birler  = sayi %10;    
    		 
System.out.println("Rakamlar çarpımı = "+ (yuzler*onlar*birler));
System.out.println("Rakamlar çarpımının rakamlar toplamına bölümünden kalan = "+ (yuzler*onlar*birler)%(yuzler+onlar+birler));
}
}
