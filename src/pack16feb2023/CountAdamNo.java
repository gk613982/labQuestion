package pack16feb2023;
import java.util.Scanner;
public class CountAdamNo {
	
	int getReverse(int a)
	{   
        int rev=0,sqrn=a*a;
		while(a!=0)
		{
			rev=rev*10+a%10;
			a=a/10;
		}
		return rev;
	}
	int getnoofdigit(int m1)
	{  
		          int c=0;
	              while(m1!=0)
		          {
			         c++;
			         m1=m1/10;
		          }  
    return c;
		   
	}
	
	String countAdamNo(int []arr)
	{
		int c=0;
		String s="";
		int n=arr.length,NoOfDigits,num,rev,sqr,sqrrev;
		for(int i=0;i<n;i++)
		{    c=0;
			NoOfDigits=new CountAdamNo().getnoofdigit(arr[i]);
			for(int j=1;j<=NoOfDigits;j++)
			{
				num=arr[i]%((int)Math.pow(10,j));
				sqr=num*num;
				rev=getReverse(num);
				sqrrev=rev*rev;		
				//System.out.println(num);
				if(sqr==new CountAdamNo().getReverse(sqrrev)) c++;
						
		    }
			s=s+c+" ";
			
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
	     System.out.println(new CountAdamNo().countAdamNo(a));

	}

}
