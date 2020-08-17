//demonstrating different ways for creating a string
import java.lang.String;
//import java.util.Scanner;
public class Example91 {
    public static void main(String[] args)
    {
        String s="welcome";
        char[] a=new char[]{'a','b','c'};
        String n=new String(a);
        String x=new String("welcome to the third way of creating a string");
        System.out.println(s);
        System.out.println(n);
        System.out.println(x);    
    }    
}