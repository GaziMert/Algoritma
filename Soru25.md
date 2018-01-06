import java.util.Scanner;

public class Soru25 {

	public static void main(String[] args) {
		int a,b;
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir sayı giriniz: ");
		a=scan.nextInt();
		System.out.println("Bir sayı giriniz: ");
		b=scan.nextInt();
		System.out.println("Okek: "+okek(a,b)); 
		
		
}
	 public static int okek(int a, int b){ 
         int okek=0; 
         for(int i=1; i<=a*b; i++){ 
             if(i%a==0 && i%b==0){ 
                 okek=i; 
                 break; 
             } 
         } 
         return okek; 
}
}
