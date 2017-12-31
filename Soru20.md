
public class Soru20 {

	public static void main(String[] args) {
		
		int dizi[]= {13,45,22,62,73,88};
		
		System.out.println("Çift sayılar: ");
		for(int i=0;i<dizi.length;i++) 
		{			
			if(dizi[i]%2==0)
			{
				
				System.out.println(dizi[i]);
			}
						
		}
		System.out.println();
		System.out.println("Tek sayılar: ");
		for(int j=0;j<dizi.length;j++)
		{
			if(dizi[j]%2!=0)
			{
				
				System.out.println(dizi[j]);
			}
		}
		

	}

}
