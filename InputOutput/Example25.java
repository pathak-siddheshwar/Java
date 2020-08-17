//demonstrating BufferedReader to read data from the console
import java.util.*;
import java.lang.*;
import java.io.*;
public class Example25 {
    public static void main(String[] args) throws Exception
    {
        //we will discuss inputstreamreader class later
        InputStreamReader i=new InputStreamReader(System.in);
        BufferedReader b=new BufferedReader(i);
        System.out.println("Enter your code name");
        String s=b.readLine();
        System.out.println("Hello "+s);
    }
}