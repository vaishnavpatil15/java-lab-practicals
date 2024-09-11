import java.io.*;
import java.util.Scanner;

class FileHandling{
    public static void main (String args[])
    {
        try{
            File f= new File("D:\\22UAI129\\abc.txt");
            if(f.createNewFile())
            {
                System.out.println("file successfully created");
            }
            else
            {
                System.out.println("File already exists ");
            }
            FileWriter myWriter = new FileWriter("D:\\22UAI129\\abc.txt");
            myWriter.write("hello world !\nHAPPY BIRTHDAY TO YOU");
            myWriter.close();
            
            Scanner sc=new Scanner(f);
            while(sc.hasNextLine())
            {
                String data = sc.nextLine();
                System.out.println(data);
            }

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
