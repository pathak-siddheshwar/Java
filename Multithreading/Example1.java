import java.util.*;
import java.io.*;
import java.lang.*;
class Example1 extends Thread{
    public void run()
    {
        System.out.println("the thread is running");
    }
    public static void main(String[] args)
    {
        Example1 e=new Example1();
        e.start();
    }
}
