import java.util.Scanner;
public class gazi {
	
	public static void main(String[] args) 
	{
		int i,j,n;
	Scanner input = new Scanner(System.in);
	System.out.print("Bir sayı giriniz: ");
	n = input.nextInt();
	for (i=1; i<=n; i++) //i=2
	{ 
		
		for(j=1;j<=(n-i);j++)
		{
			System.out.print(" "); 
		}
		for(j=1;j<=(2*i-1);j++)
		{ 
			System.out.print("*");
		}
System.out.println();
	}


		}
	}
