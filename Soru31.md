import java.util.Arrays;
import java.util.Scanner;

public class Soru31 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        int sayi, enkucuk = 999999, enbuyuk = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + ".Sayıyı Giriniz : ");
            sayi = scan.nextInt();                
            if (sayi >= enbuyuk) {             
                enbuyuk = sayi;
            }       
            if (sayi <= enkucuk) {          
                enkucuk = sayi;
            }
        }

        System.out.println();       
        System.out.println("En Büyük : " + enbuyuk);
        System.out.println("En Küçük : " + enkucuk);

	}

}
