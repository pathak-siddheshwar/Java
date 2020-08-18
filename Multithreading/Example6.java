//setting up the priority of a thread in java
import java.lang.*;
import java.io.*;
import java.util.*;
public class Example6 extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
    }
    public static void main(String[] args)
    {
        Example6 e1=new Example6();
        Example6 e2=new Example6();
        e1.setPriority(MIN_PRIORITY);
        e2.setPriority(MAX_PRIORITY);
        e1.start();
        e2.start();
    }
}