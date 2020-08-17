import java.util.Scanner;
class Example40{
    public static void main(String[] a)
    {
        String s1,s2="";
        Scanner s=new Scanner(System.in);
        s1=s.nextLine();
        for(int i=0;i<s1.length();i++)
            s2+=s1.substring(0,2);
        System.out.println(s2);
    }
}