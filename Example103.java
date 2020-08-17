//demonstrating nested try
import java.lang.Throwable;
import java.util.Scanner; 
public class Example103 {
    public static void main(String[] args)
    {
        try{
            try{
                int a=43/0;
            }
            catch(ArithmeticException e)
            {
                System.out.println(e);
            }
            try{
                int[] a=new int[]{1,2,3,4,5};
                System.out.println(a[323]);
            }
            catch(ArrayIndexOutOfBoundsException a)
            {
                System.out.println(a);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("remaining code");
    }
}