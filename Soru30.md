import java.util.Scanner;

public class Soru30 {

	public static void main(String[] args) {
		
		 Scanner scan =new Scanner(System.in);
		 String s;
		 System.out.println("Bir kelime giriniz: ");
		 s=scan.nextLine();
		 int sayi=s.length();
		 System.out.println("Kelimenin harf sayısı "+sayi);
	}

}
