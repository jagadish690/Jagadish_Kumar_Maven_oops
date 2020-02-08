package Epam.Task2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=0;
	      //Scanner o = new Scanner(System.in);
	      Scanner p = new Scanner(System.in);
	      
	      int n,a,x,y;
	         n = p.nextInt();
	        System.out.println("Enter No. of Chocolates: "+n);
	        
	        System.out.print("Enter Weights: ");
	        int[] ar = new int[n];
	        for (int i = 0; i < n; i++) {
	            ar[i] = p.nextInt();
	            System.out.print(ar[i]+" ");
	        }
	        
	         a = p.nextInt();
	          System.out.println("\nEnter No. of Sweets: "+a);
	          
	         int[] ar2 = new int[a];
	         System.out.print("Enter Weights: ");
	        for (int i = 0; i < a; i++) {
	            ar2[i] = p.nextInt(); 
	            System.out.print(ar2[i]+" ");  
	        }
	        
	        
	          x=p.nextInt();
	           System.out.println("\nEnter Higher Range Of Candies: "+x);
	           
	          y=p.nextInt();
	          System.out.println("Enter Lower Range Of Candies: "+y);
	          Choco c1=new Choco();
	          int ct=c1.numofcandy(x,y,ar,n);
	          Sweets s1=new Sweets();
	          int st=s1.numofcandy(x, y, ar2,a);
	           
	     
	       
	            System.out.println("Congratulations U got Candies: "+(ct+st));

	}

}
