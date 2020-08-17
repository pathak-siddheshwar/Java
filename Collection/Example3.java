import java.util.*;
import java.io.*;
import java.lang.*;

//demonstrating hashSet
public class Example3 {
    public static void main(String[] args)
    {
        HashSet<String> h=new HashSet<String>();
        h.add("ram");
        h.add("laxman");
        h.add("bharat");
        h.add("shatrugan");
        h.remove("shatrugan");
        Iterator<String> i=h.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
        System.out.println("point to notice is that insertion order is not maintained");
    }
}