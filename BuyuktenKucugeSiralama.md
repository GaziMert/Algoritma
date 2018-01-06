import java.util.Scanner;

public class deneme9 {
	
	public static Scanner scanner=new Scanner(System.in);
	public static void main(String [] args)
	{
		int [] gazi=getIntegers(5);
		int [] siralama=siralama(gazi);
		printArray(siralama);
		
	}
	public static int[] getIntegers(int kapasite)
	{
		int [] array=new int[kapasite];
		System.out.println("Dizinin elemanlarını giriniz: "+kapasite+" adet giriniz");
		for (int i=0;i<array.length;i++)
		{
			array[i]=scanner.nextInt();
		}
		return array;
	}
	
	public static void printArray(int[] array)
	{
		for (int i=0;i<array.length;i++)
		{
			System.out.println(i+".eleman"+" = "+array[i]);
			
		}
		
	}
	
	public static int[] siralama(int [] array )
	{
		int [] siralama=new int[array.length];
		for (int i=0;i<array.length;i++)
		{
			siralama[i]=array[i];
			
		}
		boolean flag=true;
		int temp;
		while(flag)
		{
			flag=false;
			for(int i=0;i<array.length-1;i++)
			{
				if (siralama[i]<siralama[i+1])
				{
					temp=siralama[i];
					siralama[i]=siralama[i+1];
					siralama[i+1]=temp;
					flag=true;
				}
			}
		}
		return siralama;
	}
	
	
}
