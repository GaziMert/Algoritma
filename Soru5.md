import java.util.Scanner;
public class Soru5 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		int sayi;
		String kelime;
		int i=0;
		
		System.out.println("Bir kelime giriniz: ");
		kelime=scan.nextLine();
		
		System.out.println("Miktar seçiniz");
		sayi=scan.nextInt();
		
		while(i<sayi)
		{
			System.out.println(kelime);
			i++;
		}

	}

}
