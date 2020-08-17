//demonstrating FilterInputStream to read the data from the file 
import java.lang.*;
import java.io.*;
import java.util.*;
public class Example16 {
    public int a=349;
    public static void main(String[] args)
    {
        try{
            FileInputStream f=new FileInputStream("/home/siddheshwar/Desktop/Java/Input_Output/files/file7.txt");
            FilterInputStream fi=new BufferedInputStream(f);
            int i=0;
            while((i=fi.read())!=-1)
            {
                System.out.print((char)i);
            }
            fi.close();
            f.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}