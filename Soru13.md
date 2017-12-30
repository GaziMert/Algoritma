
public class Soru13 {

 

public static void main(String[] args) {
	
	
	int sayi1;
	
	for(int i=2;i<1000;i++) 
	{
		sayi1=0;
		for(int k=2;k<=i/2;k++) 
		{
			if(i%k==0)
				sayi1++;
		}
		
		if (sayi1==0)
			System.out.println(i);
	}
	
	}
}

