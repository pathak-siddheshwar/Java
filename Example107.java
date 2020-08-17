//demonstrating exception propagation for checked exceptions
import java.*;
import java.io.IOException;

public class Example107 {
    void m() {
        try {
            throw new java.io.IOException("device error");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    void n(){
        m();
    }
    void p(){
        try{
            n();
        }
        catch(Exception e){
            System.out.println("Exception handled");
        }
    }
    public static void main(String[] args)
    {
        Example106 e=new Example106();
        e.p();
        System.out.println("rest of the code resides here");   
    }
}