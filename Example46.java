import java.util.Scanner;
class Example46{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1,s2;
        s1=s.nextLine();
        s2=s.nextLine();
        for(int i=0;i<s1.length();i++)
        {
            System.out.print(s1.charAt(i));
            System.out.print(s2.charAt(i));
        }
    }
}