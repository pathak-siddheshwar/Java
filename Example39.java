import java.util.Scanner;
class Example39{
    public static void main(String[] a)
    {
        String s1,s2,s3;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the two strings");
        s1=s.nextLine();
        s2=s.nextLine();
        s3=s1.concat(s2);
        System.out.println(s3);
    }
}