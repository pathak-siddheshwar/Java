//demonstrating CharArrayWriter to write sequence to different streams(mainly the common data)
import java.util.*;
import java.lang.*;
import java.io.*;
public class Example27 {
    public static void main(String[] args) throws Exception
    {
        CharArrayWriter c=new CharArrayWriter();
        c.write("This is written by CharArrayWriter");
        FileWriter f1=new FileWriter("/home/siddheshwar/Desktop/Java/Input_Output/files/file9.txt");
        FileWriter f2=new FileWriter("/home/siddheshwar/Desktop/Java/Input_Output/files/file10.txt");
        c.writeTo(f1);
        c.writeTo(f2);
        c.close();
        f1.close();
        f2.close();
        System.out.println("Success");
    }
}