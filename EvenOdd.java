class EvenOdd
{
public static void main (String args[])
{
int n[]={2,3,4,5,6,7,8,9,10,11,12};

System.out.println("-----EVEN-----");
for(int i=0;i<11;i++)
{

if(n[i]%2==0)
{
System.out.println(n[i]);
}
}
System.out.println("-----ODD-----");
for(int i=0;i<11;i++)
{

if(n[i]%2==1)
{
System.out.println(n[i]);
}


}

}
}
