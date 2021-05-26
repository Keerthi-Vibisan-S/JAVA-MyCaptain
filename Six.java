//Prime Number

import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a Number to check for prime or not: ");
		int n = in.nextInt();
		
		if(n==0) {
			System.out.println(n+" neither Prime nor Even");
		}
		
		else if(n%2==0)
		{
			System.out.println(n+" Not a Prime number");
		}
		
		else {
			System.out.println(n+" is a Prime number");
		}
	
	}

}
