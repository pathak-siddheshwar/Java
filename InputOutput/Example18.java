//Using console class to extract password from the console
import java.util.*;
import java.lang.*;
import java.io.*;
public class Example18 {
    public static void main(String[] args)
    {
        Console c=System.console();
        System.out.println("Enter your password");
        char[] ch=c.readPassword();
        String pass=String.valueOf(ch);
        System.out.println("Your password is: "+pass);
    }   
}