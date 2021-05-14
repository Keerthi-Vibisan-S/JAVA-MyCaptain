//Third project
//Working on loops

import java.util.Scanner;

public class Working {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number to check for palindrome: ");
		int n=in.nextInt();
		int n1=n;
		int rem,a=0;
		while(n!=0)
		{
			rem=n%10;
			a=a*10+rem;
			n=n/10;
		}
		if(a==n1)
		{
			System.out.println("The number is a palindrome number.");
		}
		else
		{
			System.out.println("Not a palindrome number.");
		}
	}

}
