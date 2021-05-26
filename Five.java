//Fifth My Captain java project
//Using Classes and Objects

import java.util.Scanner;

class Employee
{
	void display(String name, int year, int salary,String addr)
	{
		System.out.println(name+" "+year+" "+addr);
	}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of data you want to add: ");
		int n = in.nextInt();
		Employee ob=new Employee();
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Name: ");
			String name = in.next();
			System.out.println("Enter Year of Joining: ");
			int year = in.nextInt();
			System.out.println("Enter Salary: ");
			int salary = in.nextInt();
			System.out.println("Enter Adderss: ");
			String addr = in.next();
			
			ob.display(name,year,salary,addr);
		}
		

	}

}
