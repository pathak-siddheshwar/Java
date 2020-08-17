import java.util.Scanner;
class Example38{
    public static void main(String[] a)
    {
        Scanner sc=new Scanner(System.in);
        String s,rev="";
        System.out.println("enter the string");
        s=sc.nextLine();
        for(int i=s.length()-1;i>=0;i--)
        {
            rev+=s.charAt(i);
        }
        if(s.equals(rev))
            System.out.println("palindrome");
        else System.out.println("not palindrome");
    }
}