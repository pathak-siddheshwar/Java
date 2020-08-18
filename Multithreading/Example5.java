//getting the name and id of the thread and setting the name of it
import java.util.*;
import java.lang.*;
import java.io.*; 
public class Example5 extends Thread {
    public void run(){
        System.out.println("the thread is running");
    }
    public static void main(String[] args)
    {
        Example5 e1=new Example5();
        Example5 e2=new Example5();
        System.out.println(e1.getName());
        System.out.println(e2.getName());
        e2.setName("Hurrah! I got a new name");
        System.out.println(e2.getId());
        System.out.println(e2.getName());
    }
}