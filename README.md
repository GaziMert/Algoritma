import java.util.Scanner;

public class Soru24 {

	public static void main(String[] args) {
		
		int sayi,k;
		String s="";
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir sayı giriniz:");
		sayi=scan.nextInt();

		while(sayi>0)
		{
			k=sayi%2;
			s=k+s;
			sayi=sayi/2;
		}

		System.out.println(s);

	}

}
