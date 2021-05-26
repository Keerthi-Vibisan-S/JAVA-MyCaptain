//Fibonacci Series

import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a Number of terms to print in fibonacci: ");
		int n = in.nextInt();
		int a=0,b=1;
		
		System.out.print(a+" "+b+" ");
		int c=0;
		for(int i=3;i<=n;i++) {
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	
	}

}

