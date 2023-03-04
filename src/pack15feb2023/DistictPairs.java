/*Write a program in java to count all distinct pairs for a specific difference.
Expected Output:
The given array is:
5 2 3 7 6 4 9 8
The distinct pairs for difference 5 are: [7, 2] [8, 3] [9, 4]
Number of distinct pairs for difference 5 are: 3
*/





package pack15feb2023;
import java.util.Scanner;

public class DistictPairs {
	
	String getDistictPairs(int[] arr)
	{
		int n=arr.length;
		String s="";
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if((arr[i]-arr[j])==5)
					s=s+"["+arr[i]+","+arr[j]+"]";
			}
		}
		
		return s;
		
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
     
     System.out.print(new DistictPairs().getDistictPairs(a));
     
     
		
	}

}
