//demonstrating StringReader class to read string and print on console
import java.io.StringReader;  
public class Example34 {  
    public static void main(String[] args) throws Exception {  
        String srg = "Hello Java!! Welcome to Javatpoint.";  
        StringReader reader = new StringReader(srg);  
        int k=0;  
            while((k=reader.read())!=-1){  
                System.out.print((char)k);  
            }  
        }  
}  