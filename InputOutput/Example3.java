//copying a whole string into the file using fileoutputstream
import java.io.*;
import java.util.*;
import java.lang.*;
public class Example3 {
    public static void main(String[] args)
    {
        try{
        FileOutputStream f=new FileOutputStream("/home/siddheshwar/Desktop/Java/Input_Output/files/file1.txt");
        String s="Writing my first string to the file";
        byte[] b=s.getBytes();
        System.out.println(s.getBytes());
        f.write(b);
        f.close();
        System.out.println("The string is written in the file check it out");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}