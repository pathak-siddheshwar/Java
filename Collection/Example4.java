//demonstrating LinkedHashSet
import java.util.*;
import java.lang.*;
import java.io.*;
public class Example4 {
    public static void main(String[] args)
    {
        LinkedHashSet<String> s=new LinkedHashSet<String>();
        s.add("one");
        s.add("two");
        s.add("threee");
        Iterator<String> i=s.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}