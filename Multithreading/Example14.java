//Using synchronized keyword to use the object locks
import java.util.*;
import java.io.*;
import java.lang.*;
class TableAgain{
    synchronized void printTable(int n)//method that is not synchronized
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
class Thread1 extends Thread{
    Table t;
    int n;
    Thread1(Table t,int n)
    {
        this.t=t;
        this.n=n;
    }
    public void run(){
        t.printTable(n);
    }
}
class Thread2 extends Thread{
    Table t;
    int n;
    Thread2(Table t,int n)
    {
        this.t=t;
        this.n=n;
    }
    public void run(){
        t.printTable(n);
    }
}
public class Example14 {
 public static void main(String[] args){
    Table t=new Table();
    Thread1 t1=new Thread1(t,5);
    Thread2 t2=new Thread2(t,10);
    t1.start();
    t2.start();
    System.out.println("As you can see the output is consistent...as synchronization is used");
 }
}