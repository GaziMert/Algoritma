import java.util.Scanner;

public class Soru9 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int a;
		System.out.println("Bir sayı giriniz: ");
		a=scan.nextInt();
		
		if(a%2==0)
		{
			System.out.println("Sayı çifttir.");
			a=scan.nextInt();
		}
		else if(a%2!=0)
		{
			System.out.println("Sayı tektir.");
			a=scan.nextInt();
		}

	}

}
