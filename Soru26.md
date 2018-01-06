import java.util.Scanner;

public class Soru26 {

	public static void main(String[] args) {

		int a,b,c,toplam=0,ort=0;
		Scanner scan=new Scanner(System.in);
		System.out.print("Bir sayı giriniz: ");
		a=scan.nextInt();
		System.out.print("Bir sayı giriniz: ");
		b=scan.nextInt();
		System.out.print("Bir sayı giriniz: ");
		c=scan.nextInt();
		System.out.println();
		toplam=a+b+c;
		System.out.println("Sayıların toplamı: "+toplam);
		
		if((a>b) && (a>c))
		{
			System.out.println(a+" Sayısı en Büyüktür.");
		}
		else if((b>a) && (b>c))
		{
			System.out.println(b+" Sayısı en Büyüktür.");
		}
		else if ((c>a) && (c>b))
		{
			System.out.println(c+" Sayısı en Büyüktür.");
		}
		
		if((a<b) && (a<c))
		{
			System.out.println(a+" Sayısı en küçüktür.");
		}
		else if((b<a) && (b<c))
		{
			System.out.println(b+" Sayısı en küçüktür.");
		}
		else if ((c<a) && (c<b))
		{
			System.out.println(c+" Sayısı en küçüktür.");

		}

		ort=toplam/3;
		System.out.println("Sayıların ortalaması: "+ort);
}
}
