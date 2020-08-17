//FileOutputStream for writing a byte
import java.io.*;
import java.util.*;
import java.lang.*;
public class Example2 {
    public static void main(String[] args)
    {
        try{
        FileOutputStream f=new FileOutputStream("/home/siddheshwar/Desktop/Java/Input_Output/file.txt");
        f.write(String.valueOf(4).getBytes());
        f.close();
        System.out.println("Success");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}