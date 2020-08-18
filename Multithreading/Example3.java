//demonstarating IllegalThreadStateException
import java.lang.*;
import java.io.*;
import java.util.*;
public class Example3 extends Thread{
    public void run()
    {
        System.out.println("thread is running");
    }
    public static void main(String[] args)
    {
        Example3 e=new Example3();
        e.start();
        e.start();
    }
}