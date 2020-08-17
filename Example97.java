//string buffer append, insert, replace, delete, capacity and reverse 
//the following methods are same for string builder class with just synchronization as the difference factor
public class Example97 {
    public static void main(String[] args)
    {
        StringBuffer s=new StringBuffer("hello ");
        s.append("world");
        for(int i=0;i<s.length();i++)
        {
            System.out.print(s.charAt(i));
        }
        System.out.print(" ");
        s.insert(5," duniya");
        System.out.println(s);
        System.out.println(s.replace(1,3,"devl"));
        System.out.println(s.delete(1,3));
        System.out.println(s.reverse());
        System.out.println(s.capacity());
    }
}