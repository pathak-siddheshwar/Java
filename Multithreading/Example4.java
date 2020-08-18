//demonstrating join method of java
import java.lang.*;
import java.util.*;
import java.io.*;
public class Example4 extends Thread{
    public void run(){
        for(int i=1;i<=5;i++)
        {
            System.out.println(i);
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
    public static void main(String[] args)
    {
        Example4 e1=new Example4();
        Example4 e2=new Example4();
        Example4 e3=new Example4();
        e1.start();
        try{
            e1.join();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        e2.start();
        e3.start();
        
    }
}