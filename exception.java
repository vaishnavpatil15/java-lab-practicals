import java.util.*;

class exception
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int []a = new int[5];
        int b;
        int c;
        System.err.println("Enter array elements ");
        for(int i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        System.err.println("Enter divisor ");
        b=sc.nextInt();
        try
        {
            for (int i=0;i<5;i++)
            {
                c=a[i]/b;
                System.out.println(c);
                
            }
            
        }
        catch(Exception e)
        {
            System.out.println("error occured");
            System.err.println(e);
        }

    }
}