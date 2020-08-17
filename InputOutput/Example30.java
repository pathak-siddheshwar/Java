//demonstrating PritnWriter class to write data to the file as well as the console
import java.io.*;
import java.util.*;
import java.lang.*;
public class Example30 {
    public static void main(String[] args) throws Exception
    {
        PrintWriter p1=new PrintWriter(System.out);
        p1.write("Writing this data to the console");
        p1.flush();
        p1.close();
        PrintWriter p2=new PrintWriter(new File("/home/siddheshwar/Desktop/Java/Input_Output/files/file12"));
        p2.write("This data is written using PrintWriter");
        p2.flush();
        p2.close();
    }
}