//demonstrating FileReader class to read data from a file
import java.util.*;
import java.lang.*;
import java.io.*;
public class Example22 {
    public static void main(String[] args)
    {
        try{
            FileReader f=new FileReader("/home/siddheshwar/Desktop/Java/Input_Output/files/file9.txt");
            int i;
            while((i=f.read())!=-1)
            {
                System.out.print((char)i);
            }
            System.out.println();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}