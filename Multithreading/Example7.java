//demonstrating Daemon Thread
import java.util.*;
import java.lang.*;
import java.io.*;
public class Example7 extends Thread{
        public void run()
        {
            if(Thread.currentThread().isDaemon())
            {
                System.out.println("it is a daemon thread");
            }
            else{
                System.out.println("it is a user thread");
            }
        }
        public static void main(String[] args)
        {
            Example7 e1=new Example7();
            Example7 e2=new Example7();
            Example7 e3=new Example7();
            e1.setDaemon(true);
            e1.start();
            e2.start();
            e3.start();
        }
}