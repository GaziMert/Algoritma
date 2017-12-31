
public class Soru19 {

	public static void main(String[] args) {

		int[] dizi ={11,42,61,23,86,56};		
		int enbuyuksayi=dizi[0];
		
		for(int i=1;i<dizi.length;i++)
		{
			if(dizi[i]>enbuyuksayi)
			{
				enbuyuksayi=dizi[i];
			}
		}
		System.out.println("En büyük sayımız: "+enbuyuksayi);
}
}
