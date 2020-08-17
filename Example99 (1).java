//demonstrating string tokenizer class
import java.util.StringTokenizer;
public class Example99 {
    public static void main(String[] args)
    {
        StringTokenizer s=new StringTokenizer("My name is siddheshwar pathak"," ");
        while(s.hasMoreTokens())
        {
            System.out.print(s.nextToken());
        }
    }
}