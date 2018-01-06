import java.util.Scanner;

public class Soru33 {

	public static void main(String[] args) {
			
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Bir sayı giriniz: ");
		double a=scan.nextInt();
		double sonuc = 0;
		
		if(a>=50)
		{
			sonuc=a*10/100;
		}
		else if(a<50)
		{
			sonuc=a*25/100;
		}
		
		System.out.println(sonuc);
		
	}

}
