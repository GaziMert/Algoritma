import java.util.Random;

public class Soru27 {

	public static void main(String[] args) {

		int random=0;
		int cift = 0,tek=0;
		while(random!=301)
		{
			Random rnd=new Random();
			random=rnd.nextInt(200)+150;
			if(random%2==0)
			{
				System.out.print(random+"-");
				cift++;
		
			}
		
			if(random%2==1)
			{
				System.out.print(random+"-");
				tek++;
			}
		
		}
		System.out.println();
		System.out.println("Çift sayı adedi:"+cift);
		System.out.println("Tek sayı adedi:"+tek);
	}

}
