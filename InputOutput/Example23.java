//demonstrating BufferedWriter to write data to a file
import java.util.*;
import java.lang.*;
import java.io.*;
public class Example23 {
    public static void main(String[] args) throws Exception
    {
        FileWriter f=new FileWriter("/home/siddheshwar/Desktop/Java/Input_Output/files/file10.txt");
        BufferedWriter w=new BufferedWriter(f);
        String s="This data is written by BufferedWriter class";
        String s1="this is a new line";
        w.write(s);
        w.newLine();
        w.write(s1);
        w.close();
        System.out.println("Success");
    }
}