//demonstrating java Console class to get input from the console. It provides methods to read texts and passwords
import java.util.*;
import java.io.*;
import java.lang.*;
public class Example17 {
    public static void main(String[] args)
    {
        Console c=System.console();
        System.out.println("Enter your name:");
        String s=c.readLine();
        System.out.println("Hello "+s);
    }
}