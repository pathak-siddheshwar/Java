//demonstrating array index out of bounds exception
import java.*;
public class Example101 {
    public static void main(String[] args)
    {
        int[] a=new int[]{1,2,3,4,5};
        try{
            System.out.println(a[23]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        System.out.println("its the rest of the code");
    }    
}