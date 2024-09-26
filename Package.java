import java.util.*;
public class Package
{
    public static void main (String args [])
    {
        Scanner sc=new Scanner (System.in);
        int c;
        while(true)
        {
            
            System.out.println("\n\nEnter operation you want to perform \n 1.arithmatic operations\n 2.statistical operations \n 3.trignometric operations \n 0. exit\n\n");
            c = sc.nextInt();
            switch(c)
            {
                case 1:
                {
                    System.out.println("enter two numbers ");
                    double a=sc.nextDouble();
                    double b=sc.nextDouble();

                    System.out.println("Addition : "+ (a+b));
                    System.out.println("Substraction : "+ (a-b));
                    System.out.println("Multiplication : "+ (a*b));
                    System.out.println("Division : "+ (a/b));
                    break;

                }
                case 2:
                {
                    double sum=0;
                    System.out.println("enter 5 numbers ");
                    double a[] =new double[5];
                    for(int i=0;i<5;i++)
                    {
                        a[i]=sc.nextDouble();
                    }

                    for(int i=0;i<5;i++)
                    {
                       sum=sum + a[i];
                    }
                    System.out.println("Average : "+ sum/5);
                    break;

                }
                case 3:
                {
                    System.out.println("Enter angle in degrees ");
                    double x= sc.nextDouble();
                    double rad= Math.toRadians(x);
                    System.out.println("Sine value : " + Math.sin(rad));
                    System.out.println("Cosine value : " + Math.cos(rad));
                    System.out.println("Tangent value : " + Math.tan(rad));
                    break;

                }

                case 0:
                {
                    System.out.println("thank you");
                    return;
                }
            }

        }
    }
}