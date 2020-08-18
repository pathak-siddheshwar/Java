//demonstrating synchronized block to lock the objects
import java.util.*;
import java.io.*;
import java.lang.*;
class T{
    void printTable(int n){
        synchronized(this){
            for(int i=1;i<=5;i++)
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
}
class Thread3 extends Thread{
    T t;
    Thread3(T t)
    {
        this.t=t;
    }
    public void run()
    {
        t.printTable(3);
    }
}
class Thread4 extends Thread{
    T t;
    Thread4(T t)
    {
        this.t=t;
    }
    public void run()
    {
        t.printTable(3);
    }
}
public class Example15 {
    public static void main(String[] args)
    {
        T t= new T();
        Thread3 t3=new Thread3(t);
        Thread4 t4=new Thread4(t);
        t3.start();
        t4.start();
    }   
}