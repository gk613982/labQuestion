
package pack15feb2023;
import java.util.Scanner; 

class Addition
{
	int getSum(int a,int b)
	{
		int sum=a+b;
		return sum;
	}
	
}





public class Additiontesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition objAdd=new Addition();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter FNO=");
		int num1=sc.nextInt();
		System.out.print("Enter SNO=");
		int num2=sc.nextInt();
		
		int c=objAdd.getSum(num1,num2);
		System.out.print("Sum:="+c);
		
		

	}

}
