//demonstrating DataInputStream to read the data from a inputstream
import java.util.*;
import java.lang.*;
import java.io.*;
public class Example14 {
    public static void main(String[] args) throws IOException
    {
        FileInputStream f=new FileInputStream("/home/siddheshwar/Desktop/Java/Input_Output/files/file6.txt");
        DataInputStream d=new DataInputStream(f);
        int count=f.available();
        byte[] b=new byte[count];
        d.read(b);
        for(byte bt:b)
        {
            char c=(char)bt;
            System.out.print(c);
        }
        System.out.println();
    }
}