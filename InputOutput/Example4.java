//demonstrating FileInputStream to read a character from a file
import java.util.*;
import java.io.*;
import java.lang.*;
public class Example4 {
    public static void main(String[] args)throws IOException
    {
        FileInputStream f=new FileInputStream("/home/siddheshwar/Desktop/Java/Input_Output/files/file.txt");
        int c=f.read();
        System.out.println("The character read from the file is:"+(char)c);
        f.close();
    }
}