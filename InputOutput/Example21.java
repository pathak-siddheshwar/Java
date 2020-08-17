//demonstrating FileReader class which is used to write character oriented data to the file
import java.lang.*;
import java.io.*;
import java.util.*;
public class Example21 {
    public static void main(String[] args)
    {
        try{
            FileWriter f=new FileWriter("/home/siddheshwar/Desktop/Java/Input_Output/files/file9.txt");
            String s="This data is written using FileWriter class ";
            f.write(s);
            f.close();
            System.out.println("Success");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}