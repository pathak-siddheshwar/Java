//demonstrating BufferedReader to read the data line by line
import java.util.*;
import java.lang.*;
import java.io.*;
public class Example24 {
    public static void main(String[] args) throws Exception
    {
        FileReader i=new FileReader("/home/siddheshwar/Desktop/Java/Input_Output/files/file10.txt");
        BufferedReader b=new BufferedReader(i);
        String s;
        while((s=b.readLine())!=null)
        {
            System.out.println(s);
        }
        b.close();
        i.close();
    }
}