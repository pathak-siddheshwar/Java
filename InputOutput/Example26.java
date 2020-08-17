//demonstrating CharArrayReader to read a char array as Reader stream
import java.util.*;
import java.lang.*;
import java.io.*;
public class Example26 {
    public static void main(String[] args) throws Exception{
        char[] ca={'a','c','z'};
        CharArrayReader c=new CharArrayReader(ca);
        int i=0;
        while((i=c.read())!=-1)
        {
            char ch=(char)i;
            System.out.print(ch+";");
            System.out.println(i);
        }
        c.close();
    }
}