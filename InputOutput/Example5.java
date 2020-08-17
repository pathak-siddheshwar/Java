//demonstrating FileInputStream to read more than one character from a file and printing the same
import java.util.*;
import java.io.*;
import java.lang.*;
public class Example5 {
    public static void main(String[] args)
    {
        try{
        FileInputStream f=new FileInputStream("/home/siddheshwar/Desktop/Java/Input_Output/files/file1.txt");
        int i=0;
        while((i=f.read())!=-1)
        {
            System.out.print((char)i);
        }
        f.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}