// program for matrix addition and matrix multiplication.

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a[][]={{1,3,4},{2,4,3},{3,4,5}};
		int b[][]={{1,3,4},{2,4,3},{1,2,4}};
		System.out.println("Eneter 1 for Matrix Addition.");
		System.out.println("Eneter 2 for Matrix Multiplication.");
		int ch=in.nextInt();
		switch(ch)
		{
			case 1:
			{
				for(int i=0;i<3;i++)
				{
					for(int j=0;j<3;j++)
					{
						System.out.print(a[i][j]+b[i][j]+" ");
					}
				}
				break;
			}
			case 2:
			{
				for(int i=0;i<3;i++)
				{
					for(int j=0;j<3;j++)
					{
						System.out.print(a[i][j]*b[i][j]+" ");
					}
				}
				break;
			}
			default:
			{
				System.out.println("Enetred wrong choice");
			}
		}
		in.close();
	}
}
