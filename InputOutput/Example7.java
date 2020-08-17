//demonstrating BufferedInputStream to read the data from the file
import java.util.*;
import java.io.*;
import java.lang.*;
public class Example7 {
    public static void main(String[] args)
    {
        try{
        FileInputStream f=new FileInputStream("/home/siddheshwar/Desktop/Java/Input_Output/files/file2.txt");
        BufferedInputStream b=new BufferedInputStream(f);
        int i;
        while((i=b.read())!=-1)
        {
            System.out.print((char)i);
        }
        b.close();
        f.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}