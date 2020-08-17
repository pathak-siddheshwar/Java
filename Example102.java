//demonstrating try and catch with multiple exceptions
import java.lang.Throwable;
import java.util.*;
public class Example102 {
    public static void main(String[] args)
    {
        int a[]=new int[]{1,2,3,4};
        try{
            System.out.println(a[23]);
            int c=34/0;
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(a[1]);
        }
        catch(ArithmeticException ef)
        {
            System.out.println(ef);
        }
        System.out.println("left out code");
    }
}