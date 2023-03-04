package pack1.com;

import java.util.Scanner;

public class SameFirstAndLast {

	static boolean checkSame(int[] arr) {
		int n = arr.length;
		if (arr[0]==arr[n - 1])

			return true;
		else
			return false;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size=");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter array elements");
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		System.out.println(new SameFirstAndLast().checkSame(a));
	}

}
