
//demonstrating declarition of throws keyword
import java.*;
import java.io.IOException;
class Trial{
    void m() throws IOException{
        //throw new IOException();
        System.out.println("if the exception does not occur");
    }
}
public class Example109 {
    public static void main(String[] args) throws IOException{
        try{
            Trial t=new Trial();
            t.m();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
       
        System.out.println("the rest of the code runs normally");
    }
}