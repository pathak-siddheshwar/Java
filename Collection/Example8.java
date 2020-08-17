//demonstrating arraydq 
import java.util.*;
import java.lang.*;
import java.io.*;
public class Example8 {
    public static void main(String[] args)
    {
        ArrayDeque<Integer> i=new ArrayDeque<Integer>();
        i.add(323);
        i.add(34);
        i.add(334);
        for(Integer j:i)
        {
            System.out.println(j);
        }
    }
}