import java.util.Scanner;

public class deneme {
	
        
		   public static void main(String[] args) {
		      
			   Scanner scan=new Scanner(System.in);
			   
		      int girilen=1;		     		      
		      int toplam=0; 		      
		      int sayi=0; 		      
		      int sonuc=0;
		            
		      
		    
		      while ( girilen != 0) {
		    	  
		         toplam += girilen;  
		         sayi++;             
		         System.out.print("Bir sayi giriniz yada 0 yazarak durdurabilirsiniz ");
		         girilen = scan.nextInt();
		         sonuc+=girilen;
		        
		      }
		      System.out.println("Toplam: "+sonuc);
		    
		      
		      if (sayi == 0) {
		    	 
		         System.out.println();
		         
		      }
		      else {
		         
		         System.out.println();
		         System.out.println( sayi + " Tane veri girmişsiniz");
		       
		      }
		 
		   } 
		   
		} 


