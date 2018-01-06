import java.util.Arrays;
import java.util.Scanner;

public class Soru29 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int a,b,c;
		
		
		
		System.out.print("sayı giriniz: ");
		a=scan.nextInt();
		System.out.print("sayı giriniz: ");
		b=scan.nextInt();
		System.out.print("sayı giriniz: ");
		c=scan.nextInt();
		
		
		int dizi []= {a,b,c};
		Arrays.sort(dizi);
		for (int i=0;i<dizi.length;i++)
		{
			System.out.println(dizi[i]);
		}
		
		if(dizi[0]!=dizi[1]&&dizi[1]!=dizi[2])
		{
			System.out.println(dizi[0]+"<"+dizi[1]+"<"+dizi[2]);
		}
		else if(dizi[0]==dizi[1]&&dizi[1]==dizi[2])
		{
			System.out.println(dizi[0]+"="+dizi[1]+"="+dizi[2]);
		}
		else if(dizi[0]!=dizi[1]&&dizi[1]==dizi[2])
		{
			System.out.println(dizi[0]+"<"+dizi[1]+"="+dizi[2]);
		}
		else 
		{
			System.out.println(dizi[0]+"="+dizi[1]+"<"+dizi[2]);
		}

	}

}
