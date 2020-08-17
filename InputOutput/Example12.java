//demonstrating ByteArrayInputStream which reads a byte array as input stream
import java.util.*;
import java.io.*;
import java.lang.*;
public class Example12 {
    public static void main(String[] args)
    {
        try{
            byte[] buf={35,36,37,38};
            ByteArrayInputStream b=new ByteArrayInputStream(buf);
            int i=0;
            while((i=b.read())!=-1);
            {
                char c=(char)i;
                System.out.println(c);  
            }
            b.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}