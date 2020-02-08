package Epam.Task2;

public class Sweets implements Inter {
	public int numofcandy( int x, int y,int[] ar2,int a)
	{
		int c=0;
		
		 for (int i = 0; i < a; i++) {
		        if(ar2[i]<=x && ar2[i]>=y) c++;
		     }
		 return c;
		 
	}	

}
