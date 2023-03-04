package pack15feb2023;

import java.util.Scanner;

public class FourArrayElements {
	
	String getfour(int arr[])
	{
	int n=arr.length;
	String s="";
	int c=0;
	for(int i=0;i<n;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			for(int k=j+1;k<n;k++)
			{
				for(int m=k+1;m<n;m++) {
					if(arr[i]+arr[j]+arr[k]+arr[m]==37) {
						c++;
						s=s+arr[i]+" "+arr[j]+" "+arr[k]+" "+arr[m];
						break;
					}
				}
				if(c!=0)
					break;
			}
			if(c!=0)
				break;
		}
		if(c!=0)
			break;
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
 
 System.out.println(new FourArrayElements().getfour(a));
}

}
