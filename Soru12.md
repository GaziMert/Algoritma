import java.util.Scanner;

public class Soru12 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int a,b,c;
		
		System.out.println("1. Sayıyı giriniz: ");
		a=scan.nextInt();
		System.out.println("2. Sayıyı giriniz: ");
		b=scan.nextInt();
		System.out.println("3. Sayıyı giriniz: ");
		c=scan.nextInt();
		
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
		
		if ((a>b) && (a<c) || (a>c) && (a<b))
		{
			System.out.println(a+" Sayısı ortancadır.");
		}
		else if ((b>a) && (b<c) || (b>c) && (b<a))
		{
			System.out.println(b+" Sayısı ortancadır.");
		}
		else if ((c>a) && (c<b) || (c>b) && (c<a))
		{
			System.out.println(c+" Sayısı ortancadır.");
		}
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
	}

}
