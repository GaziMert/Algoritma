
import java.util.Scanner;
import java.util.Random;;

public class Soru22 {

	public static void main(String[] args )
	{
		
	Random rnd=new Random();
	int tutulan=rnd.nextInt(100);
	int hak=0;
	
	while(hak < 10)
	{
		Scanner klavye = new Scanner(System.in);
		
		System.out.println("Bir sayı giriniz: ");
		int girilen = klavye.nextInt();
		
		if(girilen>tutulan)
		{
			System.out.println("Girdiğiniz sayı rastgele sayıdan büyüktür.");
			
			hak++;
		}
		
		else if (girilen<tutulan)
		{
			System.out.println("Girdiğiniz sayı rastgele sayıdan küçüktür.");
			hak++;
		}
		else if(girilen==tutulan)
		{
			System.out.println("Tebrikler");
			System.out.println("Rastgele Sayı:"+tutulan);
		}
		
	}
	
		
	}	
	
	
}
