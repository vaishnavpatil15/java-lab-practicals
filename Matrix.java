import java.util.Scanner;

class matrixx
{
	int a[][]= new int[2][2];
	int b[][]= new int[2][2];
	Scanner sc=new Scanner(System.in);
	
	void get()
	{


		System.out.println("\nEnter elements of matrix 1");
		for (int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("\nEnter elements of matrix 1");
		for (int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}

	}
	void print()
	{
		System.out.println("\n Matrix 1 :");

		for (int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(" " + a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("\n Matrix 2 :");

		for (int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(" " + b[i][j]+" ");
			}
			System.out.println();
		}


	}

	void add()
	{
		System.out.println("\n\n Addition :");
		for (int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				int c=a[i][j]+b[i][j];
				System.out.print(" " + c + " ");
			}
			System.out.println();
		}

	}

	void sub()
	{
		System.out.println("\n\n Difference :");
		for (int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				int c=a[i][j]-b[i][j];
				System.out.print(" " + c + " ");
			}
			System.out.println();
		}

	}

	void mul()
	{
		System.out.println("\n\n Multiplication :");
		for (int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				int c=a[i][j]*b[i][j];
				System.out.print(" " + c + " ");
			}
			System.out.println();
		}

	}

	void div()
	{
		System.out.println("\n\n Division :");
		for (int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				int c=a[i][j]/b[i][j];
				System.out.print(" " + c + " ");
			}
			System.out.println();
		}

	}



	


}
class Matrix
{
public static void main (String []   args)
{
	matrixx m= new matrixx();
	m.get();
	m.print();

	m.add();
	m.sub();
	m.mul();
	m.div();


}
}