//demonstrating priority q class
import java.util.*;
import java.io.*;
import java.lang.*;
public class Example7 {
    public static void main(String[] args)
    {
        PriorityQueue<Integer> i=new PriorityQueue<Integer>();
        i.add(34);
        i.add(35);
        i.add(355);
        for(Integer j:i)
        {
            System.out.println(j);
        }
    }
}