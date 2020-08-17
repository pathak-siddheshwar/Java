//demonstrating BufferedOutputStream to write data to a file
import java.util.*;
import java.lang.*;
import java.io.*;
public class Example6 {
    public static void main(String[] args)
    {
        try{
        FileOutputStream f=new FileOutputStream("/home/siddheshwar/Desktop/Java/Input_Output/files/file2.txt");
        BufferedOutputStream b=new BufferedOutputStream(f);
        String s="This is the string that I need to write using the buffer";
        byte[] by=s.getBytes();
        b.write(by);
        b.flush();
        b.close();
        f.close();
        System.out.println("Most probably the data has been written to the file");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }    
}