//demonstrating code for Reader class to read out the characters from a stream
import java.lang.*;
import java.io.*;
import java.util.*;
public class Example20 {
    public static void main(String[] args) throws IOException
    {
        Reader r=new FileReader("/home/siddheshwar/Desktop/Java/Input_Output/files/file8.txt");
        int data=r.read();
        while(data!=-1)
        {
            System.out.print((char)data);
            data=r.read();
        }
        r.close();
    }
}