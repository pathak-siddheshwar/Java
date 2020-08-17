//comparing strings on basis of equals == compareTo
public class Example93 {
    public static void main(String[] args)
    {
        String s="welcome";
        String w="welcome";
        String p="nobody";
        String a=new String("asset");
        if(s.equals(w))
        {
            System.out.println("equal");
        }
        if(s==w)
        {
            System.out.println("equal");
        }
        System.out.println(s.compareTo(w));
    }
}