//demonstrating PrintStream class to write data to a different stream, flushing is not required
import java.lang.*;
import java.io.*;
import java.util.*;
public class Example28 {
    public static void main(String[] args) throws Exception
    {
        FileOutputStream f=new FileOutputStream("/home/siddheshwar/Desktop/Java/Input_Output/files/file11.txt");
        PrintStream p=new PrintStream(f);
        p.println("This line is printed by using print stream");
        p.println("Writing integer"+34);
        p.close();
        f.close();
        System.out.println("success");    
    }
}