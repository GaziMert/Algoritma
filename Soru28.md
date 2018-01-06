import java.util.Scanner;

public class Soru28 {

	public static void main(String[] args) {

		 String original, reverse = ""; 
	      Scanner scan = new Scanner(System.in);
	 
	      System.out.println("Palindrom olup olmadığını kontrol etmek istediğiniz kelimeyi veya sayıyı giriniz: ");
	      original = scan.nextLine();
	 
	      int length = original.length();
	 
	      for (int i = length-1; i>=0; i--)
	         reverse = reverse + original.charAt(i);
	 
	      if (original.equals(reverse))
	         System.out.println("Girdiğiniz kelime palindromdur.");
	      else
	         System.out.println("Girdiğiniz kelime palindrom değildir.");
		

	}

}
