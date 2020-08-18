//demonstrating static synchronization in java
import java.util.*;
import java.io.*;
import java.lang.*;
class Tb{
    synchronized static void printTable(int n)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(i*n);
            try{
                Thread.sleep(400);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
class A1 extends Thread{
    public void run()
    {
        Tb.printTable(1);
    }
}

class A2 extends Thread{
    public void run()
    {
        Tb.printTable(10);
    }
}

class A3 extends Thread{
    public void run()
    {
        Tb.printTable(5);
    }
}

class A4 extends Thread{
    public void run(){
        Tb.printTable(3);
    }
}

public class Example16 {
    public static void main(String[] args)
    {
        A1 t1=new A1();
        A2 t2=new A2();
        A3 t3=new A3();
        A4 t4=new A4();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }    
}