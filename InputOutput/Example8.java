//demonstrating sequence input stream
//it is used to read the data from multiple streams one by one
import java.lang.*;
import java.io.*;
import java.util.*;
public class Example8 {
    public static void main(String[] args)
    {
        try{
        FileInputStream f1=new FileInputStream("/home/siddheshwar/Desktop/Java/Input_Output/files/file1.txt");
        FileInputStream f2=new FileInputStream("/home/siddheshwar/Desktop/Java/Input_Output/files/file2.txt");
        SequenceInputStream s=new SequenceInputStream(f1,f2);
        int i=0;
        while((i=s.read())!=-1)
        {
            System.out.print((char)i);
        }
        System.out.println();
        s.close();
        f1.close();
        f2.close();
        System.out.println("Read the data from two different streams and then printed them");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}