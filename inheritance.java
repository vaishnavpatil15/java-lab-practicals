class Person
{
    String name;
    String address;
    int birthyear;
    int age;

    int calculateAge()
    {
        age=2024-birthyear;
        return age;
    }

}

class Student extends Person
{
    int roll_no;
    int [] marks=new int[5];


    float calculateAvg()
    {
        int sum=0;
        for (int i=0;i<5;i++)
        {
            sum=sum+marks[i];
        }
        float avg=sum/5;
        return avg;
    }

    void display()
    {
        System.out.println("\n\nname :"+ name );
        System.out.println("address :"+ address );
        System.out.println("age :"+ calculateAge());
        System.out.println("roll number :"+ roll_no );
        //System.out.println("makrs :"+  );
        System.out.println("average :"+ calculateAvg());
        System.out.println("\n");


    }


}

class Employee extends Person
{
    int emp_id;
    float salary;

    float calculateTax()
    {
        float tax;
        tax = salary * 0.1f;
        return tax;
    }

    void display()
    {
        System.out.println("\n\nname :"+ name );
        System.out.println("address :"+ address );
        System.out.println("age :"+ calculateAge());
        System.out.println("employee ID :"+ emp_id );
        System.out.println("salary :"+ salary );
        System.out.println("tax :"+ calculateTax());
        System.out.println("\n");

    }

}





class inheritance
{
    public static void main (String args[])
    {
        Student s =new Student();
        s.name="rohan";
        s.address="kolhapur";
        s.birthyear=2004;
        s.roll_no=129;
        s.marks[0]=10;
        s.marks[1]=11;
        s.marks[2]=12;
        s.marks[3]=13;
        s.marks[4]=14;
        s.display();

        Employee p =new Employee();
        p.name="ram";
        p.address="kolhapur";
        p.birthyear=2004;
        p.emp_id = 129;
        p.salary=10000;
        p.display();


    }
}