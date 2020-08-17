//demonstrating writer class to write char sequence or string to a file
import java.util.*;
import java.lang.*;
import java.io.*;
public class Example19 {
    public static void main(String[] args)
    {
        try{
            Writer w=new FileWriter("/home/siddheshwar/Desktop/Java/Input_Output/files/file8.txt");
            String s="This data is written by the use of Writer abstract class";
            w.write(s);
            w.close();
            System.out.println("Success");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}