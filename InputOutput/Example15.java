//demonstrating FilterOutputStream to write data to a file
import java.io.*;
import java.lang.*;
import java.util.*;
public class Example15 {
    public static void main(String[] args){
        try{
            FileOutputStream f=new FileOutputStream("/home/siddheshwar/Desktop/Java/Input_Output/files/file7.java");
            FilterOutputStream fi=new FilterOutputStream(f);
            String s="This data is written and read from and to this file by using FilterOutputStream";
            byte[] b=s.getBytes();
            fi.write(b);
            fi.flush();
            fi.close();
            f.close();
            System.out.println("data written");
        }
        catch(Exception e)
        {
            System.out.println("e");
        }
    }
}