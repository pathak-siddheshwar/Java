//demonstrating shutdown hook by anonymus class
import java.util.*;
import java.lang.*;
import java.io.*;
public class Example10 {
    public static void main(String[] args) throws Exception{
        Runtime r=Runtime.getRuntime();
        r.addShutdownHook(new Thread(){
            public void run(){
                System.out.println("shutdown hook is attached to this thread");
            }
        }
        );
        System.out.println("now main is sleeping ....press ctrl+c to exit");
        try
        {
            Thread.sleep(4000);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}