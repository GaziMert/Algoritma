import java.util.Scanner;

public class Soru15 {

	public static void main(String[] args) {

		System.out.print("Terse çevirmek istediğiniz cümleyi giriniz: " );
		Scanner scan=new Scanner(System.in);
		String girilen=scan.nextLine();
		for (int i =girilen.length()-1; i >=0; i--) {
		System.out.print(girilen.charAt(i));

	}

}
}
