//demonstrating SequenceInputStream to read data from two files and writing them to third file
import java.util.*;
import java.io.*;
import java.lang.*;
public class Example9 {
    public static void main(String[] args) throws IOException
    {
        FileInputStream f1=new FileInputStream("/home/siddheshwar/Desktop/Java/Input_Output/files/file1.txt");
        FileInputStream f2=new FileInputStream("/home/siddheshwar/Desktop/Java/Input_Output/files/file2.txt");
        SequenceInputStream s=new SequenceInputStream(f1,f2);
        FileOutputStream o=new FileOutputStream("/home/siddheshwar/Desktop/Java/Input_Output/files/file3.txt");
        int i=0;
        while((i=s.read())!=-1)
        {
            o.write(i);
        }
        s.close();
        f1.close();
        f2.close();
        o.close();
        System.out.println("copied the contents of two files into the third file using sequence input stream class");
    }
}