import java.util.Scanner;

class employe
{
	String name[]= new String[10];
	int id[]=new int[10];
	int sal[]=new int [10];
	int n;
	Scanner sc= new Scanner(System.in);
	
	void get ()
	{
		System.out.println("\nEnter number of employees to enter data :");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println("\n     employee number "+ i +" :\n");
			System.out.print("Enter employee name : ");
			name[i]=sc.next();
			System.out.print("Enter employee id : ");
			id[i]=sc.nextInt();
			System.out.print("Enter employee salary : ");
			sal[i]=sc.nextInt();
			System.out.println();

		}

	}

	void display()
	{
		System.out.println("\n\nEnter employee number to display info :");
		n=sc.nextInt();
		System.out.println("\nName : " + name[n]);
		System.out.println("ID : " + id[n]);
		System.out.println("Salary : " + sal[n]);
		System.out.println();
	}
}

class employee
{
public static void main (String args[])
{
	employe e=new employe();
	e.get();
	e.display();
}
}