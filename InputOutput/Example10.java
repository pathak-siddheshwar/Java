//demonstrating SequenceInputStream to read the data from more than two files
//In such a case we use enumeration (vector class elments method)
import java.util.*;
import java.lang.*;
import java.io.*;
public class Example10 {
    public static void main(String[] args)
    {
        try{
            FileInputStream f1=new FileInputStream("/home/siddheshwar/Desktop/Java/Input_Output/files/file.txt");
            FileInputStream f2=new FileInputStream("/home/siddheshwar/Desktop/Java/Input_Output/files/file1.txt");
            FileInputStream f3=new FileInputStream("/home/siddheshwar/Desktop/Java/Input_Output/files/file2.txt");
            FileInputStream f4=new FileInputStream("/home/siddheshwar/Desktop/Java/Input_Output/files/file3.txt");
            Vector v=new Vector();
            v.add(f1);
            v.add(f2);
            v.add(f3);
            v.add(f4);
            Enumeration en=v.elements();
            SequenceInputStream sq=new SequenceInputStream(en);
            int i=0;
            while((i=sq.read())!=-1)
            {
                System.out.print((char)i);
            }
            sq.close();
            f1.close();
            f2.close();
            f3.close();
            f4.close();
        }
        catch(Exception e)
        {
            System.out.println("The code throws the following exception "+ e);
        }
    }
}