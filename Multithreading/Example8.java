//demonstrating thread group in java
import java.lang.*;
import java.io.*;
import java.util.*;
public class Example8 implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String[] args)
    {
        Example8 e=new Example8();
        ThreadGroup tg=new ThreadGroup("thread group"); 
        Thread t1=new Thread(tg,e,"one");
        t1.start();
        Thread t2=new Thread(tg,e,"two");
        t2.start();
        Thread t3=new Thread(tg,e,"three");
        t3.start();
        System.out.println("the name of the thread group is: "+tg.getName());
        tg.list();
    }
}