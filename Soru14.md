import java.util.Scanner;
public class Soru14
{
public static void main(String[] args)
{
	int a,b;
	int k=1;	
	for(k=1; k<=100; k++)
	{
		System.out.print(k+" Sayısının pozitif bölenleri: ");	
		for (a=1; a<=k; a++)
		{
			b= k % a;		
			if(b==0)
			{
				System.out.print(a + " ");
			}
		}
		System.out.println();
	}
}
}
