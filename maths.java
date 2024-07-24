import java.util.Scanner;

class maths
{
public static void main(String args [])
{
	int a,b;
	int sum,sub,mul,div,mod;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter first number :");
	a=sc.nextInt();
	System.out.println("enter second number :");
	b=sc.nextInt();
	sum=a+b;
	System.out.println("addition : "+ sum);
	sub=a-b;
	System.out.println("substraction : "+ sub);
	mul=a*b;
	System.out.println("multiplication : "+ mul);
	div=a/b;
	System.out.println("division : "+ div);
	mod=a%b;
	System.out.println("modulas : "+ mod);
	
}
}