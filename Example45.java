import java.util.Scanner;
class Example45{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1,s2="";
        int i,index;
        s1=s.nextLine();
        for(i=0;i<s1.length();i++)
            if(s1.charAt(i)=='*')
            {
                index=i;
                break;
            }
        s2+=s1.substring(0,i-1)+s1.substring(i+2,s1.length());
        System.out.println(s2);
    }
}