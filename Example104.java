//demonstrating finally
import java.lang.Throwable;
import java.util.Scanner;

public class Example104 {
    public static void main(String[] args)
    {
        try{
            int a=34/0;
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        finally{
            System.out.println("this is finally block and will be executed");
        }
        System.out.println("the rest of the code will run as well");
    }
}