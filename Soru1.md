import java.util.Scanner;
public class Soru1 {

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		int hak=1;
		int toplam = 0;
		
		while(hak<=15)
		{		
			
			System.out.println(hak + ". sayıyı giriniz: ");
			int girilen = klavye.nextInt();
			
			
			
			toplam+=hak;
			hak++;
			
		}
		System.out.println("Toplam: "+toplam);

	}

}
