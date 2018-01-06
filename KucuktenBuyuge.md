import java.util.Arrays;
import java.util.Scanner;

public class deneme7 {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		int a,b,c,d,e;
		
		
		
		System.out.println("sayı giriniz: ");
		a=scan.nextInt();
		System.out.println("sayı giriniz: ");
		b=scan.nextInt();
		System.out.println("sayı giriniz: ");
		c=scan.nextInt();
		System.out.println("sayı giriniz: ");
		d=scan.nextInt();
		System.out.println("sayı giriniz: ");
		e=scan.nextInt();
		
		int dizi []= {a,b,c,d,e};
		Arrays.sort(dizi);
		for (int i=0;i<dizi.length;i++)
		{
			System.out.println(dizi[i]);
		}
	}

}
