//Understanding the problem without synchronization
import java.util.*;
import java.io.*;
import java.lang.*;
class Table{
    void printTable(int n)//method that is not synchronized
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
class T1 extends Thread{
    Table t;
    int n;
    T1(Table t,int n)
    {
        this.t=t;
        this.n=n;
    }
    public void run(){
        t.printTable(n);
    }
}
class T2 extends Thread{
    Table t;
    int n;
    T2(Table t,int n)
    {
        this.t=t;
        this.n=n;
    }
    public void run(){
        t.printTable(n);
    }
}
public class Example13 {
 public static void main(String[] args){
    Table t=new Table();
    T1 t1=new T1(t,5);
    T2 t2=new T2(t,10);
    t1.start();
    t2.start();
    System.out.println("As you can see the output is inconsistent...to prevent this synchronization is used");
 }
}