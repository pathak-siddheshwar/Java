//demonstrating try catch block in java
import java.lang.Throwable;
public class Example100 {
    public static void main(String[] args)
    {
        int i=50,j=0;
        int data;
        try{
            data=i/j;
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("it's out of try catch block so exception handling will make a contineous flow of the code");
    }
}