//demonstrating multitasking using multithreading
import java.util.*;
import java.io.*;
import java.lang.*;
class Trial extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
        System.out.println("all the threads will execute this task");
    }
}
public class Example11 {
    public static void main(String[] args)
    {
        Trial t1=new Trial();
        Trial t2=new Trial();
        Trial t3=new Trial();
        t1.start();
        t2.start();
        t3.start();
    }
}