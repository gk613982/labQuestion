/*Given an array of int s, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more. 
firstLast6({1, 2, 6}) → true
firstLast6({6, 1, 2, 3}) → true
firstLast6({13, 6, 1, 2, 3}) → false

*/

package pack1.com;

import java.util.Scanner;

public class CountOfEvenAndOdd {

	static boolean checkCond(int[] arr) {
		int n = arr.length;
		if (arr[0] == 6 || arr[n - 1] == 6)

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
		System.out.println(new CountOfEvenAndOdd().checkCond(a));
	}

}
