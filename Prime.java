class Prime
{
public static void main (String args[])
{
int n=12;

for(int i= 2;i<n;i++)
{
if(n%i==0)
{
System.out.println("Not a Prime Number");
return;
}
}

System.out.println("Prime number");
}
}
