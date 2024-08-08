import java.util.*;

class employee
{
    private String name;
    private String id;
    private double sal;

    employee()
    {

    }

    employee(String id, String name , double sal)
    {
        this.id=id;
        this.name=name;
        this.sal=sal;

    }
    void set()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter employee id : ");
        id=sc.next();
        System.out.println("Enter employee name : ");
        name=sc.next();
        System.out.println("Enter employee salary : ");
        sal=sc.nextInt();
    }

    String getId()
    {
        return id;
    }
    String getName()
    {
        return name;
    }
    double getSal()
    {
        return sal;
    }

    Double raise_salary()
    {
        sal=sal*1.1;
        return sal;
    }

}

class constructor
{
    public static void main(String args[])
    {
        employee e1=new employee();
        e1.set();
        System.out.println("\n\nNAME : " + e1.getName());
        System.out.println("ID : " + e1.getId());
        System.out.println("SALARY : " + e1.getSal());
        System.out.println("\nRaised Salary : " + e1.raise_salary());


    }
}