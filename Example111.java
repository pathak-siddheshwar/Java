//demonstrating custom exceptions in java
import java.lang.Throwable;
import java.util.*;
class InvalidAgeException extends Exception{
    InvalidAgeException(String s)
    {
        super(s);
    }
}
class AgeCheck{
    void validate(int age) throws InvalidAgeException {
        if(age<18)
        {
            throw new InvalidAgeException("under age");
        }
        else{
            System.out.println("the age is fine you can proceed");
        }
    }
}
public class Example111 {
    public static void main(String[] args)
    {
        try{
            AgeCheck a=new AgeCheck();
            Scanner s=new Scanner(System.in);
            System.out.println("enter age");
            int n=s.nextInt();
            a.validate(n);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("rest of the code");
    }
}