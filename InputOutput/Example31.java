//demonstrating OutputStreamWriter to convert char stream to byte stream and then writing it to the file
import java.lang.*;
import java.io.*;
import java.util.*;
public class Example31 {
    public static void main(String[] args) throws Exception
    {
        OutputStream o=new FileOutputStream("/home/siddheshwar/Desktop/Java/Input_Output/files/file13.txt");
        Writer w=new OutputStreamWriter(o);
        w.write("This data was converted to byte stream and then flushed to the output stream");
        w.close();
        System.out.println("Success");
    }
}