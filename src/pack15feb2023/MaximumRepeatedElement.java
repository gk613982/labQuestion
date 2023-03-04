package pack15feb2023;
import java.util.Scanner;

public class MaximumRepeatedElement {
		
		int getRepeated(int[] arr)
		{
			int c=0,k=0,large=0,n=arr.length;
			for(int i=0;i<n;i++)
			{    c=0;
				for(int j=i+1;j<n;j++)
				{
					if(arr[i]==arr[j]) 
						c++;
					   
				}
				if(c>large) { large=c;k=i;}
			}
			
			return arr[k];
			
		}
		
		

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	     Scanner sc=new Scanner(System.in);
	     System.out.print("Enter array size=");
	     int n=sc.nextInt();
	     int a[]=new int[n];
	     System.out.println("Enter array elements");
	     for(int i=0;i<n;i++)
	    	 a[i]=sc.nextInt();
	     
	     System.out.print(new MaximumRepeatedElement().getRepeated(a));
	     sc.close();
	     
			
		}
	

	}

