class practice_exercise_1{
    public static void main(String args[])
    {
        int d , m , d2,m2; 
        d=Integer.parseInt(args[0]);
        m=Integer.parseInt(args[1]);
        d2=Integer.parseInt(args[2]);
        m2=Integer.parseInt(args[3]);
        
        
        int today=0;
        int []a=new int []{0,31,28,31,30,31,30,31,31,30,31,30,31};
        for(int i=1;i<m;i++)
        {
            today=today+a[i];
        }
        today=today+d;


        int day=0;
        for(int i=1;i<m2;i++)
        {
            day=day+a[i];
        }
        day=day+d2;
        int diff;
        diff=day-today;
        System.out.println(diff + " Days left for "+ args[2]+" " +args[3] + " 2024 ");
    }
}