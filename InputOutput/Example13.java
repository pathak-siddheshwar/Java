//demonstrating data output stream to write the primitive types to a output stream
import java.lang.*;
import java.io.*;
import java.util.*;
public class Example13 {
    public static void main(String[] args)
    {
        try{
            FileOutputStream f=new FileOutputStream("/home/siddheshwar/Desktop/Java/Input_Output/files/file6.txt");
            String s="This string is written using the DataOutputStream";
            DataOutputStream d=new DataOutputStream(f);
            d.writeChars(s);
            d.flush();
            d.writeInt(65);
            d.flush();
            d.close();
            f.close();
            System.out.println("data has been written successfully to the file");
        }
        catch(Exception e)
        {
            System.out.println(e);

        }
    }
}