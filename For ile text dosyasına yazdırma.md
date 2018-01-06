import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

public class txtYazdirma {

	public static void main(String[] args) {
		
		ArrayList<String> veri=new ArrayList<String>();
		
		for (int i=0;i<10;i++)
		{
			String st=""+i;
			veri.add(st);
		}
		
		FileWriter fWriter=null;
		try
		{
			fWriter=new FileWriter("C:\\Users\\Gazi\\Desktop\\Yeni Metin Belgesi.txt");
			BufferedWriter writer = new BufferedWriter(fWriter);
			for (int i=0;i<veri.size();i++)
			{
				writer.write(veri.get(i));
				writer.newLine();
				System.out.println(veri.get(i));
			}
			writer.close();
		}
		catch (Exception e)
		{
		
		}
		
	}

}
