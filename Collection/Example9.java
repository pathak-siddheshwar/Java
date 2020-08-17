//demonstrating Hashmap 
import java.util.*;
import java.io.*;
import java.lang.*;
public class Example9 {
    public static void main(String[] args)
    {
        HashMap<Integer,String> m=new HashMap<Integer,String>();
        m.put(1,"sid");
        m.put(2,"harshu");
        m.put(3,"rniwas");
        Set s=m.entrySet();
        Iterator i=s.iterator();
        while(i.hasNext())
        {
            Map.Entry entry=(Map.Entry)i.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        for(int j=0;j<m.size();j++)
        {
            System.out.println(m.get(j));
        }
    }
}