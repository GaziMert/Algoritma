
public class Soru6 {

	public static void main(String[] args) {
		int toplam=0;
		for(int i=1;i<=1000;i++)
		{
			if(i%5==0 && i%7!=0)
			{
				System.out.println(i);
				toplam+=i;
			}
			
		}
		System.out.println();
		System.out.println("Sayıların Toplamı: "+toplam);

	}

}
