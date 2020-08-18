//demonstrating the working of shutdown hook on a thread
import java.lang.*;
import java.util.*;
import java.io.*;
class MyThread extends Thread{
    public void run(){
        System.out.println("shutdown hook working properly");
    }
}
public class Example9 {
    public static void main(String[] args) throws Exception{
        Runtime r=Runtime.getRuntime();
        r.addShutdownHook(new MyThread());
        System.out.println("now main is sleeping....press Ctrl+c to exit");
        try{
            Thread.sleep(3000);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}