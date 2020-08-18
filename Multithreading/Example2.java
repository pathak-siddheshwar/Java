//demonstrating how to sleep a thread
import java.util.*;
import java.lang.*;
import java.io.*;
public class Example2 extends Thread {
    public void run(){
        for(int i=0;i<5;i++)
        {
            System.out.println(Thread.currentThread().getName());
            System.out.println(i);
            try{
                sleep(2000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
            
        }
    }
    public static void main(String[] args)
    {
        Example2 e1=new Example2();
        Example2 e2=new Example2();
        e1.start();
        e2.start();
    }
}
