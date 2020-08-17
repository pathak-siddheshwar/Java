//clearing the default automatically created streams
//System.in System.out System.err
import java.io.*;
class Example1{
    public static void main(String[] args) throws IOException
    {
        int i=System.in.read();
        System.out.println((char)i);
    }
}