//using throw to explicitly throw an exception
import java.lang.Throwable;
import java.util.Scanner;
public class Example105 {
    static void count(int num)
    {
        if(num<18)
            throw new ArithmeticException("own created exception");
        else
            System.out.println("it is working fine");
    }
       public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        count(n);
    }
}