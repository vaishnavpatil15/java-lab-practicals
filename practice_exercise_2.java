
import java.util.*;
class practice_exercise_2 {
    public static void main(String[] args) {
        int [][]matrix=new int [4][2];

        Scanner sc=new Scanner(System.in);

        System.out.println("fill marksheet") ;
        for (int i=0;i<4;i++)
        {
            System.out.println("Enter marks of student "+ i);
            for(int j=0;j<2;j++)
            {
                System.out.print("Subject "+ j +":");
                matrix[i][j]=sc.nextInt();
            }
        }
        double per;
        
        System.out.println("\n\n        MARKSHEET ");
        for(int i=0;i<4;i++)
        {
            int sum=0;
            
            for (int j=0;j<2;j++)
            {
               sum=sum+matrix[i][j];
            }
            per=sum/2;
            System.out.println("\nStudent " + i +" got "+ per + " percentage in exam ");
        }
    }
}
