//demonstrating InputStreamReader to read data from the file
import java.lang.*;
import java.io.*;
import java.util.*;
public class Example32{
    public static void main(String[] args) throws Exception
    {
        InputStream o=new FileInputStream("/home/siddheshwar/Desktop/Java/Input_Output/files/file13.txt");
        Reader w=new InputStreamReader(o);
        int i=0;
        while((i=w.read())!=-1)
        {
            System.out.print((char)i);
        }/home/siddheshwar/Desktop/Java/Input_Output/files/file13.txt
        w.close();
        o.close();
    }
}