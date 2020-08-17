//demonstrating ByteArrayOutputStream to write common data to two files
import java.util.*;
import java.io.*;
import java.lang.*;
public class Example11 {
    public static void main(String[] args) throws IOException
    {
        FileOutputStream f1=new FileOutputStream("/home/siddheshwar/Desktop/Java/Input_Output/files/file4.txt");
        FileOutputStream f2=new FileOutputStream("/home/siddheshwar/Desktop/Java/Input_Output/files/file5.txt");
        ByteArrayOutputStream b=new ByteArrayOutputStream();
        String s="This is the output when we copy common data to two different files using bytearrayoutputstream";
        b.write(s.getBytes());
        b.writeTo(f1);
        b.writeTo(f2);
        b.flush();
        b.close();
        f1.close();
        f2.close();
        System.out.println("Success");
    }
}