
public class Soru3 {

	public static void main(String[] args) {
		
		int toplam=0;
		int sonuc = 0;
		
		for(int i=45;i<=225;i++)
		{
			if(i%2==0 && i%7==0)
			{
				sonuc=toplam+=i;
			}
			
		}
		System.out.println(sonuc);
	}

}
