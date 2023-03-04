package pack1.com;

import java.util.Scanner;

public class TwoarrSamefirstAndLast {

	static boolean checkSame(int[] a,int[] b ) {
	
		if (a[0]==b[0] || a[a.length-1]==b[b.length-1])

			return true;
		else
			return false;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st array size=");
		int n1= sc.nextInt();
		System.out.print("Enter 2nd array size=");
		int n2= sc.nextInt();
		int[] a = new int[n1];
		int[] b = new int[n2];
		System.out.println("Enter 1st array elements");
		for (int i = 0; i < n1; i++)
			a[i] = sc.nextInt();
		System.out.println("Enter 2nd array elements");
		for (int i = 0; i < n2; i++)
			b[i] = sc.nextInt();
		
		System.out.println(new TwoarrSamefirstAndLast().checkSame(a,b));
	}

}
