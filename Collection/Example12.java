//demonstrating hashtable 
import java.util.*;
import java.io.*;
import java.lang.*;
public class Example12 {
    public static void main(String[] args)
    {
        Hashtable<Integer,String> hm=new Hashtable<Integer,String>();  
  
  hm.put(100,"Amit");  
  hm.put(102,"Ravi");  
  hm.put(101,"Vijay");  
  hm.put(103,"Rahul");  
  
  for(Map.Entry m:hm.entrySet()){  
   System.out.println(m.getKey()+" "+m.getValue());  
  }  
    }
}