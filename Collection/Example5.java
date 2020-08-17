//demonstrating treeset 
import java.util.*;
import java.io.*;
import java.lang.*;
public class Example5 {
    public static void main(String[] args){
        TreeSet<Integer> i=new TreeSet<Integer>();
        i.add(34);
        i.add(3);
        i.add(34);
        i.add(356);
        i.add(1);
        Iterator<Integer> d=i.iterator();
        while(d.hasNext()){
            System.out.println(d.next());
        }
    }
}