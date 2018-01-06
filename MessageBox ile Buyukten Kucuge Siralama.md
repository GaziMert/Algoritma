import javax.swing.JOptionPane;

public class deneme8 {

	public static void main(String[] args) {
		
		
		int dizi[]=new int [5];
		for(int i=0; i<5; i++)
		{
		dizi[i]=Integer.parseInt(JOptionPane.showInputDialog((i+1)+". Elemanı Giriniz :"));
		}
		for(int i=0; i<5; i++)
		{
			for(int j=i+1; j<5; j++)
			{
				if(dizi[i]<dizi[j]) 
				{
					int oku=dizi[j];
					dizi[j]=dizi[i];
					dizi[i]=oku;
				}
			}
		}
		String yazdir = "";
		for(int i=0; i<5; i++)
		yazdir+=dizi[i]+" ";
		System.out.println("Diziye Girilen Elemanlar: "+yazdir);
		
		 }

	}
